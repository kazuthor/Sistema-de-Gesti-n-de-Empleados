
/**
 * Write a description of class EmpleadoTiempoParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoTiempoParcial extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;
    
    public EmpleadoTiempoParcial(String nombre, String id, double salarioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Salario por Hora: " + salarioPorHora + ", Horas Trabajadas: " + horasTrabajadas;
    }
}