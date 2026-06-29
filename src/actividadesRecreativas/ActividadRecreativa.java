/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesRecreativas;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Student
 */
public class ActividadRecreativa {
    
    protected String nombre;
    protected LocalDate fecha;
    protected LocalTime hora;
    protected String cupomax;
    

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getCupomax() {
        return cupomax;
    }

    public ActividadRecreativa(String nombre, LocalDate fecha, LocalTime hora, String cupomax) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupomax = cupomax;
    }
    
    
    
    
    
}
