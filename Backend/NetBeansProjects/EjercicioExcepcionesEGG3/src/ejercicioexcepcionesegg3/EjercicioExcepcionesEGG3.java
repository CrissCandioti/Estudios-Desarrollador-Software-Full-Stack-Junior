/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepcionesegg3;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcionesEGG3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Utilizamos un bloque try-catch para contener nuestro metodo por posibles excepciones interrumpiendo el flujo de nuestro programa
        try {
            EjercicioExcepcionesEGG3.division();//Ingresamos dentro de los bloques de instruccion try nuestro metodo
        } catch (ArithmeticException e) {//Bloque catch que contiene la excepcion especificada que puede ocurrir en nuestro metodo
            System.out.println("Error al realizar la division. El divisor es 0");//Mensaje mostrando la informacion que ocaciona la excepcion, en este caso divisor por cero
        } catch (NumberFormatException a){//Bloque catch que contiene la excepcion especificada que puede ocurrir en nuestro metodo
            System.out.println("Error al realizar la division. Se intenta dividir con numeros decimales");//Mensaje mostrando la informacion que ocaciona la excepcion, en este caso divison con numeros decimales.F
        }
        
    }
//Creamos un metodo estatico dentro de la clase main con el nombre "Division". Dicho metodo contendra la palabra clave "throws" la cual especificaremos las posibles excepciones que puede ocacionar nuestro metodo
    public static void division() throws ArithmeticException, NumberFormatException {
        Scanner leer = new Scanner(System.in);//Creamos Scanner para que el usuario ingrese los datos.
        System.out.println("Ingrese el primer numero, luego ingrese el segundo");//Mensaje de ingreso de datos
        String a = leer.nextLine();//Ingreso de datos por teclado
        System.out.println("Ingrese el segundo numero para realizar la division");
        String b = leer.nextLine();
        int division = Integer.parseInt(a) / Integer.parseInt(b);//Se crea una variable tipo de dato int, con la funcion parseint para convertir las cadenas a enteros y realizar la division
        System.out.println("La division es: " + division);//Si la division se realiza sin problemas se muestra el mensaje dando por finalizada la operacion establecida.
    }
}
