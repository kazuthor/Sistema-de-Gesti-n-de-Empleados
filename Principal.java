
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan Perez", "001", 50000);
        Empleado empleado2 = new EmpleadoTiempoParcial("Maria Lopez", "002", 20, 120);
        
        System.out.println(empleado1);
        System.out.println("Salario: " + empleado1.calcularSalario());
        
        System.out.println(empleado2);
        System.out.println("Salario: " + empleado2.calcularSalario());
    }
}