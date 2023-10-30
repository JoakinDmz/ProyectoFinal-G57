/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgrupo57.Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author agust
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private LocalDate fechaIn;
    private LocalDate fechaOn;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDest;
    private String tipo;

    public Alojamiento() {
    }

    public Alojamiento(int idAlojamiento, LocalDate fechaIn, LocalDate fechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDest, String tipo) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
        this.tipo = tipo;
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDest, String tipo) {
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
        this.tipo = tipo;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOn() {
        return fechaOn;
    }

    public void setFechaOn(LocalDate fechaOn) {
        this.fechaOn = fechaOn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDest() {
        return ciudadDest;
    }

    public void setCiudadDest(Ciudad ciudadDest) {
        this.ciudadDest = ciudadDest;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return idAlojamiento + ")" + tipo + " $" + importeDiario ;
                //"Alojamiento{" + "idAlojamiento=" + idAlojamiento + ", fechaIn=" + fechaIn + ", fechaOn=" + fechaOn + ", estado=" + estado + ", servicio=" + servicio + ", importeDiario=" + importeDiario + ", ciudadDest=" + ciudadDest + ", tipo=" + tipo + '}';
    }

    
    
}
