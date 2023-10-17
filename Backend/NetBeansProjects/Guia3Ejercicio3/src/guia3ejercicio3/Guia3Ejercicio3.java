/*
Nos piden modelar un Auto con las siguientes características y comportamiento para poder ser
anexado al proyecto.

A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo
tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener
en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible
suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos
tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay
combustible suficiente.

• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.

B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además
Rueda tendrá los siguientes comportamientos:

• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI

C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas,
avanzar/retroceder, y llenarTanque.

Nota: La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen
llevar una presión recomendada comprendida entre los 28 a 30 PSI.
 */
package guia3ejercicio3;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda R1 = new Rueda("Yokohama", 28.0);
        Rueda R2 = new Rueda("Yokohama", 28.0);
        Rueda R3 = new Rueda("Yokohama", 28.0);
        Rueda R4 = new Rueda("Yokohama", 28.0);

        Auto A1 = new Auto("Rojo", "A1-159753");
        A1.setCubierta1(R1);
        A1.setCubierta2(R2);
        A1.setCubierta3(R3);
        A1.setCubierta4(R4);
        
        System.out.println("Bienvenidos");
        System.out.println("En esta nueva app controlaremos un auto");
        System.out.println("Antes de mostrar nuestro menu de opciones, debemos tener en cuenta que nuestro\n"
                + "vehículo constara con una carga inicial de 50lts");
        System.out.println("Y podremos controlar la presion de nuestra cubiertas de forma individual");
        System.out.println("-----MOVIMIENTOS-----");
        System.out.println("AVANZAR:");
        System.out.println("Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener\n"
                + "en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible\n"
                + "suficiente.");
        System.out.println("RETROCEDER:");
        System.out.println("Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos\n"
                + "tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay\n"
                + "combustible suficiente.");
        System.out.println("LLENAR TANQUE");
        System.out.println("Llenará el tanque de este auto nuevamente con 50lts de combustible.");
        System.out.println("APAGAR MOTOR");
        System.out.println("Se apagara el motor dando por finalizada el control del veiculo");

        A1.movimientos();

        System.out.println("Ahora controlaremos las cubiertas");
        System.out.println("INFLAR: la presión regresa a 28.0 PSI\n"
                + "PINCHAR: se debe reducir la presión al mínimo.\n"
                + "DESINFLAR: reduce la presión de la rueda -0.5 PSI\n"
                + "SALIR: daremos por finalizada la operac");

        A1.neumaticos(R1, R2, R3, R4);
    }

}
