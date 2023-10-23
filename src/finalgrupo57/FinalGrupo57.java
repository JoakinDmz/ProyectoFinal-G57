/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgrupo57;

import finalgrupo57.AccesoADatos.CiudadData;
import finalgrupo57.AccesoADatos.Conexion;
import finalgrupo57.AccesoADatos.PasajeData;
import finalgrupo57.Entidades.Ciudad;
import finalgrupo57.Entidades.Pasaje;
import java.sql.Connection;

/**
 *
 * @author agust
 */
public class FinalGrupo57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con= Conexion.getConexion();

        //creamos una cuidad
        Ciudad ciu=new Ciudad(12,"La Banda", "Argentina", true, "Santiago del Estero");
        CiudadData cd= new CiudadData();
        //cd.guardarCiudad(ciu);
        //para borrar agregamos id antes de ciudad en ciu
        cd.borrarCiudad(ciu);
        //Ciudad ciu=new Ciudad(3, "Posadas", "Argentina", true, "Misiones");
        //CiudadData cd=new CiudadData();
        //System.out.println(cd.buscarCiudad(3));


        //CiudadData cD = new CiudadData();
        
        //Ciudad sanLuis = new Ciudad(4, "San Juan", "Argentina", true, "San Juan");
        //Ciudad merlo = new Ciudad(5,"Merlo", "Argentina", true, "San Luis");

        //cD.guardarCiudad(merlo);
        //cD.modificarCiudad(sanLuis);
        //cD.borrarCiudad(sanLuis);dad(2));
        //System.out.println(cD.buscarCiudad(2));
        // System.out.println(cD.buscarCiudad(2));
//        for (Ciudad x : cD.listarCiudad()) {
//            System.out.println(x.getIdCiudad());
//            System.out.println(x.getProvincia());
//            System.out.println(x.getPais());
//        }
        //PasajeData pD = new PasajeData();
        //Pasaje pas = new Pasaje(1,"Avion", 10000, merlo, true);
        //Pasaje pas2 = new Pasaje (7,"auto",2, sanLuis,true);
        //pD.guardarPasaje(pas);
        
        //Para poder modificar el pasaje hay que pasarle el numero de id
        //pD.modificarPasaje(pas2);
        //pD.eliminarPasaje(pas);
       
        //System.out.println(pD.buscarPasaje(1));
        
//        for (Pasaje x : pD.listarPasajes()) {
//            System.out.println(x.getIdPasaje());
//            System.out.println(x.getImporte());
//            System.out.println(x.getNombreCiudadOrigen().getNombre());
//        }
//        
    }
}
