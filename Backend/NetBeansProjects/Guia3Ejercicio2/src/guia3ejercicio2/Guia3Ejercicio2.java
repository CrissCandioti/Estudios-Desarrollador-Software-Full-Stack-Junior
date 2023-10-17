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
package guia3ejercicio2;

import java.util.Date;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaDeIngreso1 = new Date(117, 10, 5);
        Date fechaDeIngreso2 = new Date(117, 9, 10);
        Date fechaDeIngreso3 = new Date(117, 11, 15);
        Empleado sujeto1 = new Empleado("Carlitox", "Freya", fechaDeIngreso1, 321456987);
        Empleado sujeto2 = new Empleado("Valentina", "Frey", fechaDeIngreso2, 987159357);
        Empleado sujeto3 = new Empleado("El Viejo", "Chaleco", fechaDeIngreso3, 357159654);
        Kiosco k1 = new Kiosco("La Bacha", "Las Heras", 2025987159);
        System.out.println("Bienvenido a nuestra app para contratar");
        System.out.println("A continuacion mostraremos a 3 personas");
        System.out.println("Sus perfiles laborales son perfectos para el puesto");
        k1.contratos(sujeto1);
        k1.contratos2(sujeto2);
        k1.contratos3(sujeto3);
        k1.mayorAntiguedad();
    }

}
