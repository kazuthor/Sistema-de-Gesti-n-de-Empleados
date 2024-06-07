/**
 * Abstract class Empleado - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Empleado{
    private String nombre;
    private String id;
    
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    
    public abstract double calcularSalario();
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id;
    }
}
