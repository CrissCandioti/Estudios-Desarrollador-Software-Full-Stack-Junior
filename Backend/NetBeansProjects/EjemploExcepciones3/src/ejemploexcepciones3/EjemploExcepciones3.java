/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones3;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjemploExcepciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos una clase Errores que hereda de Exception, con esta clase creada, crearemos excepciones propias.
        try {
            //En nuestro try-catch tendremos nuestro metodo estatico "ingresoNumero". Si se cumple con las condiciones no se interrumpe el flujo del metodo.
            //caso contrario de interrumpirse, entraria al catch, donde tendriamos los distintos errores que puede ocacionar. En nuestro ejemplo de la clase creada "Errores
            //dentro del catch llamaremos a la clase y le daremos un nombre. Lo que estamos haciendo es crear o instanciar un objeto de la clase errores que hereda de excepciones para poder luego mostrar la informacion que necesitemos
            EjemploExcepciones3.ingresoNumero();

        } catch (Errores e) {
            System.out.println("Mal ingreso de dato");//Solamente mostraremos un mensaje mostrando el mal ingreso de datos, y dando por finalizado nuestro programa
        }

        try {
            EjemploExcepciones3.ingresoNombre();
        } catch (Errores e) {
            System.out.println("No se ingreso ningun dato");
        }
    }

    public static void ingresoNumero() throws Errores {
        //Debemos utilizar la palabra reservada throws con la "s" al final, para especificar el error que puede ocacionar nuestro metodo
        //puede tener mas de una expecion. En este ejemplo es nuestra clase expeciones creada con anterioridad.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor a 10");
        int numero = leer.nextInt();

        if (numero <= 10) { // Si el usuario no cumple con el ingreso de dato, que sea mayor a 10.
            throw new Errores("El numero ingresado es menor a 10"); //Con la palabra throw sin la "s" al final, instanciaremos de nuestra clase creada llamada Errores
            //una excepcion propia para interrumpir el flujo de nuestro metodo.
            //Al entrar en nuestra excepcion creada se interrumpe el resto de la linea de codigo de nuestro metodo
        }
        System.out.println("El numero ingresado es:" + numero);
    }

    public static void ingresoNombre() throws Errores {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        if (nombre.isEmpty()) {
            throw new Errores("No se ingreso ningun dato");
        }
    }
}
