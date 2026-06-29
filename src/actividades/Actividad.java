/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package actividades;

/**
 *
 * @author Student
 */
public enum Actividad {
    
    CAMINATAS("caminatas"),
    COCINA("Cocina"),
    RECORRIDOS("Recorridos");
    
    private final String status;
    
    private Actividad(status);{
    this.status = status;
}
    public String getStatus();{
    return status;
    
}

    @Override
    public String toString() {
        return "Actividad{" + "ordinal=" + ordinal() + ", name=" + name() + ", status=" + status + '}';
    }
    
    
    
}
