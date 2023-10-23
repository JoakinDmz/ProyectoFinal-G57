package finalgrupo57.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import finalgrupo57.AccesoADatos.*;
import finalgrupo57.Entidades.*;
import java.sql.Statement;


public class AlojamientoData {
    private Connection con = null;
    private CiudadData cd= new CiudadData();

    public AlojamientoData() {
        this.con = Conexion.getConexion();
    }
    public List<Alojamiento> listarAlojamientos() {

        String sql = "SELECT * FROM alojamiento WHERE estado = 1";
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Alojamiento alo = new Alojamiento();
                alo.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alo.setFechaIn(rs.getDate("fechaIn").toLocalDate());
                alo.setFechaOn(rs.getDate("fechaOn").toLocalDate());
                alo.setServicio(rs.getString("servicio"));
                alo.setTipo(rs.getString("tipo"));
                alo.setImporteDiario(rs.getDouble("importeDiario"));
                alo.setCiudadDest(cd.buscarCiudadParaLista(rs.getInt("ciudadDest")));
                alojamientos.add(alo);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro alojamiento");
        }
        return alojamientos;
    }
    
    
    public void guardarAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento (fechaIn, fechaOn, servicio,  tipo,  importeDiario, ciudadDest, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        if (alojamiento.getCiudadDest().isEstado() != false) {

            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
                ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
                ps.setString(3, alojamiento.getServicio());
                ps.setString(4, alojamiento.getTipo());
                ps.setDouble(5, alojamiento.getImporteDiario());
                ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
                ps.setBoolean(7, true);
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    alojamiento.setIdAlojamiento(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Alojamiento agregado");

                }
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar alojamiento");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Ciudad no existente");
        }
    }
    public void modificarAlojamiento(Alojamiento alojamiento) {
        String sql=" UPDATE alojamiento SET fechaIn = ?, fechaOn = ?, servicio = ?, tipo = ?, importeDiario = ?, ciudadDest  = ? "
                + " WHERE idAlojamiento = ? ";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setString(3, alojamiento.getServicio());
            ps.setString(4, alojamiento.getTipo());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
            ps.setInt(7, alojamiento.getIdAlojamiento());
            int exito =ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Alojamiento modificado");
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar alojamiento");
        }
    }
    public void eliminarAlojamiento(int id){
        String sql=" UPDATE alojamiento SET estado = 0 WHERE idAlojamiento = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Alojamiento eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar el alojamiento");
                   
        }
    
    }
//    public Alojamiento buscarAlojamiento(int ciudadDest) {
//
//        String sql = "SELECT tipo, servicio, importeDiario FROM alojamiento WHERE ciudadDest= ? AND estado = 1";
//        Alojamiento alojamiento = null;
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1,ciudadDest);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                alojamiento = new Alojamiento();
//                alojamiento.setIdAlojamiento(ciudadDest);
//
//                alojamiento.setTipo(rs.getString("tipo"));
//                alojamiento.setServicio(rs.getString("servicio"));
//                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
//                alojamiento.setEstado(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No existente el alojamiento");
//
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "No se econtró alojamiento");
//        }
//        return alojamiento;
//    }
    public Alojamiento buscarAlojamiento(int id){
       Alojamiento alojamiento=new Alojamiento();
       CiudadData cd = new CiudadData();
    String sql = "SELECT fechaIn, fechaOn, servicio, tipo, importeDiario, ciudadDest, estado FROM alojamiento WHERE idAlojamiento=?";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alojamiento.setIdAlojamiento(id);
                alojamiento.setFechaIn(rs.getDate("fechaIn").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("fechaOn").toLocalDate());
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setTipo(rs.getString("tipo"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                alojamiento.setCiudadDest(cd.buscarCiudad(rs.getInt("ciudadDest")));
                alojamiento.setEstado(rs.getBoolean("estado"));
            }else{
            JOptionPane.showMessageDialog(null, "No se encontro alojamiento");
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al buscar alojamiento"+ ex.getMessage());
        }
    
    
       return alojamiento;
    
    
    }
    
}
