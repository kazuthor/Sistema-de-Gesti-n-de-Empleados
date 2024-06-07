
/**
 * Write a description of class EmpleadoTiempoCompleto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioAnual;
    
    public EmpleadoTiempoCompleto(String nombre, String id, double salarioAnual) {
        super(nombre, id);
        this.salarioAnual = salarioAnual;
    }
    
    @Override
    public double calcularSalario() {
        return salarioAnual;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Salario Anual: " + salarioAnual;
    }
}
