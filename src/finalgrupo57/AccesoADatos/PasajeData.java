/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgrupo57.AccesoADatos;

import finalgrupo57.Entidades.Pasaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author agust
 */
public class PasajeData {
    private Connection con = null;

    public PasajeData() {

        con = Conexion.getConexion();
    }
    
    
    
    public void guardarPasaje(Pasaje pasaje){
    
    String sql = "INSERT INTO pasaje(tipoTransporte, importe, nombreCiudadOrigen, estado) VALUES (?, ?, ?, ?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3,pasaje.getNombreCiudadOrigen().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasaje guardado con exito");
            }else{
            JOptionPane.showMessageDialog(null, "No se pudo guardar el pasaje");
            
            }
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Pasaje "+ ex.getMessage());
        }
    
    
    
    
    }
    
    
    public void modificarPasaje(Pasaje pasaje){
    
    String sql = "UPDATE pasaje SET tipoTransporte=?,importe = ?,nombreCiudadOrigen=?,estado=? WHERE idPasaje=?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getNombreCiudadOrigen().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setInt(5, pasaje.getIdPasaje());
            
             int x = ps.executeUpdate();

            if (x == 1) {
                JOptionPane.showMessageDialog(null, "Pasaje Modificado con exito");
            }else{
            
            JOptionPane.showMessageDialog(null, "No se pudo modificar el pasaje");
            
            }
            ps.close();

            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar pasaje "+ex.getMessage());
        }
    
    
    
    
    }
    
    
    public void eliminarPasaje(Pasaje pasaje){
    String sql = "UPDATE pasaje SET estado = 0 "
            + "WHERE idPasaje=?";
    
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pasaje.getIdPasaje());
            int x = ps.executeUpdate();
        
            if (x==1) {
                JOptionPane.showMessageDialog(null, "Pasaje eliminado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar pasaje " + ex.getMessage());
        }
    
    
    
    }
    
    public Pasaje buscarPasaje(int id){
       Pasaje pasaje = new Pasaje();
       CiudadData cD = new CiudadData();
    String sql = "SELECT tipoTransporte, importe, nombreCiudadOrigen, estado FROM pasaje WHERE idPasaje=?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasaje.setIdPasaje(id);
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setEstado(rs.getBoolean("estado"));
                pasaje.setNombreCiudadOrigen(cD.buscarCiudad(id));
                pasaje.setImporte(rs.getDouble("importe"));
            }else{
            JOptionPane.showMessageDialog(null, "No se encontro pasaje con esa id");
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro al buscar pasaje "+ ex.getMessage());
        }
    
    
       return pasaje;
    
    
    }
    
    public List<Pasaje>listarPasajes(){
    
    String sql = "SELECT idPasaje, tipoTransporte, importe, nombreCiudadOrigen, estado FROM pasaje WHERE estado = 1";
    
    CiudadData cD = new CiudadData();
    ArrayList<Pasaje> pasajes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Pasaje pasaje = new Pasaje();
                
                
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setNombreCiudadOrigen(cD.buscarCiudad(rs.getInt("nombreCiudadOrigen")));
                pasaje.setEstado(rs.getBoolean("estado"));
               pasajes.add(pasaje);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro ninguna ciudad en la lista");
        }
        return pasajes;
    
    
    
    }
    public List<Pasaje>listarPasajesCiudad(int id){
    
    String sql = "SELECT idPasaje, tipoTransporte, importe, nombreCiudadOrigen, estado FROM pasaje WHERE nombreCiudadOrigen =? AND estado = 1";
    
    CiudadData cD = new CiudadData();
    ArrayList<Pasaje> pasajes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Pasaje pasaje = new Pasaje();
                
                
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setNombreCiudadOrigen(cD.buscarCiudadParaLista(rs.getInt("nombreCiudadOrigen")));
                pasaje.setEstado(rs.getBoolean("estado"));
               pasajes.add(pasaje);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro ninguna ciudad en la lista");
        }
        return pasajes;
    
    
    
    }
    
}
