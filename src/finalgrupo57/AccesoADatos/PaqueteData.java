

package finalgrupo57.AccesoADatos;

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
import finalgrupo57.Entidades.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;



public class PaqueteData {
    
    private Connection con = null;
    private CiudadData cd= new CiudadData();
    private AlojamientoData ad= new AlojamientoData();
    private PasajeData pd = new PasajeData();
     public PaqueteData() {
        con = Conexion.getConexion();

    }
     
     public void guardarPaquete (Paquete paq){
         String sql="INSERT INTO paquete(cOrigen, cDestino, idAlojamiento, idPasaje)"
                 + "VALUES (?, ?, ? ,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, paq.getOrigen().getIdCiudad());
            ps.setInt(2, paq.getDestino().getIdCiudad());
            ps.setInt(3, paq.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paq.getPasaje().getIdPasaje());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                paq.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete guardado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar paquete");
        }
     
        
     }
     
     public void borrarPaquete(int idAlojamiento, int idPasaje){
         //esto es un borrado FISICO!!
         String sql="DELETE FROM paquete WHERE idAlojamiento = ? AND idPasaje = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ps.setInt(2, idPasaje);
            
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Paquete eliminado");
            
            }
            
          ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paquete");
        }
     
     
     }
     
     public void modificarPaquete(Paquete paquete) {
         
        String sql=" UPDATE paquete SET cOrigen = ?, cDestino = ?, idAlojamiento = ?, idPasaje = ? "
                + " WHERE idPaquete = ? ";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.setInt(5, paquete.getIdPaquete());
            int exito =ps.executeUpdate();
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Paquete modificado");
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar paquete");
        }
    }
     
     public Paquete buscarPaquete(int id) {
        
       CiudadData cd = new CiudadData();
        AlojamientoData ad = new AlojamientoData();
        PasajeData pd= new PasajeData();
        String sql = " SELECT cOrigen , cDestino , idAlojamiento , idPasaje FROM paquete WHERE idPaquete = ? ";
        Paquete paquete= null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paquete= new Paquete();
                paquete.setIdPaquete(id);
                paquete.setOrigen(cd.buscarCiudad(rs.getInt("cOrigen")));
                paquete.setDestino(cd.buscarCiudad(rs.getInt("cDestino")));
                paquete.setAlojamiento(ad.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paquete.setPasaje(pd.buscarPasaje(rs.getInt("idPasaje")));
                

            } else {
                JOptionPane.showMessageDialog(null, "Paquete no encontrado");

            }
           
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar paquete");
        }
        return paquete;

    }
     public List<Paquete> listarPaquetes() {

        String sql = "SELECT * FROM paquete ";
        ArrayList<Paquete> paquetes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Paquete paq = new Paquete();
                paq.setIdPaquete(rs.getInt("idPaquete"));
                paq.setOrigen(cd.buscarCiudad(rs.getInt("cOrigen")));
                paq.setDestino(cd.buscarCiudad(rs.getInt("cDestino")));
                paq.setAlojamiento(ad.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paq.setPasaje(pd.buscarPasaje(rs.getInt("idPasaje")));
                
                
                
                paquetes.add(paq);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar paquetes");
        }
        return paquetes;
    
    
}
     
     
      public String tipoTemporada(LocalDate fecha1, LocalDate fecha2) {
        int inicio = fecha1.getMonthValue();
        int fin = fecha2.getMonthValue();

        if (inicio == Month.JANUARY.getValue() || inicio == Month.JULY.getValue() && fin == Month.JANUARY.getValue() || inicio == Month.JULY.getValue()) {
            return "Alta";
        } else if ((inicio == Month.FEBRUARY.getValue() || inicio == Month.JUNE.getValue())
                && (fin == Month.FEBRUARY.getValue() || fin == Month.JUNE.getValue())) {
            return "Media";
        } else {
            return "Baja";
        }

    }

    public double calcularPrecio(Paquete paquete) {
        PaqueteData pD = new PaqueteData();
        double precioAl = paquete.getAlojamiento().getImporteDiario();
        double precioPa = paquete.getPasaje().getImporte();

        long dias = ChronoUnit.DAYS.between(paquete.getAlojamiento().getFechaIn(), paquete.getAlojamiento().getFechaOn());
        System.out.println(dias);
        double total = (dias * precioAl) + precioPa;

        if (tipoTemporada(paquete.getAlojamiento().getFechaIn(), paquete.getAlojamiento().getFechaOn()).equals("Alta")) {
            return total * 1.30;
        } else if (tipoTemporada(paquete.getAlojamiento().getFechaIn(), paquete.getAlojamiento().getFechaOn()).equals("Media")) {
            return total * 1.15;
        } else {

            return total;

        }

    }
     
     public List<Paquete> listarPaquetesId(int id) {

        String sql = "SELECT * FROM paquete WHERE cOrigen=?";
        ArrayList<Paquete> paquetes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Paquete paq = new Paquete();
                paq.setIdPaquete(rs.getInt("idPaquete"));
                paq.setOrigen(cd.buscarCiudad(rs.getInt("cOrigen")));
                paq.setDestino(cd.buscarCiudad(rs.getInt("cDestino")));
                paq.setAlojamiento(ad.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paq.setPasaje(pd.buscarPasaje(rs.getInt("idPasaje")));



                paquetes.add(paq);

            } 

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar paquetes");
        }
        return paquetes;


}
     
     
     

}
