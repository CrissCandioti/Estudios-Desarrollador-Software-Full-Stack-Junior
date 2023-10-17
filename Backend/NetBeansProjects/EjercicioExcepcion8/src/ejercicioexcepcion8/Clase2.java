/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepcion8;

/**
 *
 * @author Criss Candioti
 */
public class Clase2 {

    public static void main(String[] args) {
        //Bloque try-catch
        try {
            //Dentro del bloque try-catch se encuentra la funcion
            System.out.println(metodo());//Si el metodo se ejecuta con normalidad retorna el valor del metodo
        } catch (Exception e) {//Bloque catch con la creacion de la variable de la clase padre o super clase exception para mostrar informacion. 
            System.err.println(" Excepcion en metodo() ");//Mensaje de error
            e.printStackTrace();//Muestra la informacion del tipo de excepcion
        }

    }

    private static int metodo() {//Metodo estatico que retornara el valor de un tipo de dato entero
        int valor = 0;//Variable de tipo de dato primitivo entero inicializada en 0
        try {//Comienzo del bloque try
            valor = valor + 1;//Operacion con variable valor
            valor = valor + Integer.parseInt("W");//Se produce la primera excepcion,Excepcion por un mal dato en parseint
            valor = valor + 1;//No se ejecuta este codigo
            System.out.println("Valor final del try: " + valor);//No se ejecuta este codigo
        } catch (NumberFormatException e) {//Al producirce una excepcion se entra al bloque catch
            valor = valor + Integer.parseInt("42");//Operacion correcta con parseint
            System.out.println("Valor final del catch: " + valor);//Mensaje 
        } finally {//Bloque finally (Siempre se ejecuta)
            valor = valor + 1;//Operacion con variable valor
            System.out.println("Valor final del finally: " + valor);//Mensaje
        }
        //Aunque se salio del bloque try-catch-finally estas lineas de codigo se ejecutan
        valor = valor + 1;//Operacion con variable valor
        System.out.println("Valor antes del return: " + valor);//Mensaje 
        return valor;//Retorna la variable valor
    }
}
