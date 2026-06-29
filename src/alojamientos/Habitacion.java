/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alojamientos;

/**
 *
 * @author Student
 */
public class Habitacion extends Alojamiento{
    
    private String numPiso;
    private boolean balcon;

    public Habitacion(String codigo, String nombre, String capamax, String precio, boolean estado) {
        super(codigo, nombre, capamax, precio, estado);
    }
    
            
    
}
