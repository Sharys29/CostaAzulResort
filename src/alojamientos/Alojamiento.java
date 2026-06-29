/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alojamientos;

/**
 *
 * @author Student
 */
public abstract class Alojamiento {
    
    protected String codigo;
    protected String nombre;
    protected String capamax;
    protected String precio;
    protected boolean estado;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapamax() {
        return capamax;
    }

    public String getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setCapamax(String capamax) {
        this.capamax = capamax;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Alojamiento(String codigo, String nombre, String capamax, String precio, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capamax = capamax;
        this.precio = precio;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alojamiento" + "codigo=" + codigo + ", nombre=" + nombre + " capamax=" + capamax + " precio=" + precio + " estado=" + estado;
    }
    
    
}
