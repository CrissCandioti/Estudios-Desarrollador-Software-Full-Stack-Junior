/*
Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.

Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego
incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado
de mayor antigüedad.
 */
package guia3ejercicio2b;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Ejercicio2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.setNombre("Carlitox");
        e1.setApellido("Frey");
        e1.setDni(12654789);
        e1.setFechaDeIngreso(LocalDate.of(2017, 11, 17));
        
        Empleado e2 = new Empleado();
        e2.setNombre("manu");
        e2.setApellido("Gigolo");
        e2.setDni(65789951);
        e2.setFechaDeIngreso(LocalDate.of(2017, 11, 18));
        
        Empleado e3 = new Empleado();
        e3.setNombre("paco");
        e3.setApellido("merlo");
        e3.setDni(15357159);
        e3.setFechaDeIngreso(LocalDate.of(2017, 11, 16));
        
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        
        Kiosco k1 = new Kiosco("race", 5184, 202596470);
        k1.contratos(empleados);
        k1.empleadoAntiguo();
    }
    
}
