/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgrupo57.AccesoADatos;

import finalgrupo57.Entidades.Ciudad;
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
public class CiudadData {

    private Connection con = null;

    public CiudadData() {

        con = Conexion.getConexion();
    }

    public void guardarCiudad(Ciudad ciudad) {

        String sql = "INSERT INTO ciudad(nombre, pais, provincia, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setBoolean(4, ciudad.isEstado());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "ciudad guardada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ciudad " + ex.getMessage());
        }

    }

    public void modificarCiudad(Ciudad ciudad) {


        String sql = "UPDATE ciudad SET nombre = ?,pais = ?,provincia = ?, estado = ? "
                + "WHERE idCiudad =? ";

//        String sql = "UPDATE ciudad SET nombre=?,pais=?,estado=?,Provincia=? "
//                + "WHERE idCiudad =?";


        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setBoolean(4, ciudad.isEstado());
            ps.setInt(5, ciudad.getIdCiudad());
            int x = ps.executeUpdate();

            if (x == 1) {
                JOptionPane.showMessageDialog(null, "Ciudad Modificada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modiciar ciudad " + ex.getMessage());
        }

    }

    public void borrarCiudad(Ciudad ciudad) {
         //ahora borrarCiudad tambien cambia el estado de los alojamientos en dicha ciudad
        String sql = "UPDATE ciudad, alojamiento SET ciudad.estado=0, alojamiento.estado=0 WHERE idCiudad=? AND ciudadDest=? AND ciudad.estado=1";
           
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad.getIdCiudad());
            ps.setInt(2, ciudad.getIdCiudad());

            int x = ps.executeUpdate();
           // System.out.println(x);
            if (x >= 1) {
                JOptionPane.showMessageDialog(null, "Ciudad borrada");
            }
           ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al borrar ciudad " + ex.getMessage());

        }
        
    }

    public Ciudad buscarCiudad(int id) {

        String sql = "SELECT nombre,pais,provincia,estado FROM ciudad WHERE idCiudad= ? AND estado = 1";
        Ciudad ciudad = new Ciudad();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                //ciudad.setEstado(true);
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));//SE COMENTO ciudad.setEstado(true) y agrego esta linea
                ciudad.setIdCiudad(id);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la ciudad"); //se muestra todo el tiempo

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar ciudad");
        }
        return ciudad;
        
     
    }
    
        public Ciudad buscarCiudadParaLista(int id) {

        String sql = "SELECT nombre,pais,estado,provincia FROM ciudad WHERE idCiudad= ? AND estado = 1";
        Ciudad ciudad = new Ciudad();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                //ciudad.setEstado(true);
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));//SE COMENTO ciudad.setEstado(true) y agrego esta linea
                ciudad.setIdCiudad(id);

            } else {
                

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar ciudad");
        }
        return ciudad;
        
        
        
        

    }
    
    
    
    
    
    
    public List<Ciudad> listarCiudad() {

        String sql = "SELECT idCiudad,nombre,pais,provincia,estado FROM ciudad WHERE estado = 1";
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Ciudad ciudad = new Ciudad();
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(true);
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                
                ciudades.add(ciudad);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro ninguna ciudad en la lista");
        }
        return ciudades;
    
    
}
}
