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
public class Clase3 {

    public static void main(String[] args) {
        //Bloque try-catch dentro del metodo main
        try {
            System.out.println(metodo());//Muestra el valor que retornara nuestra funcion si se ejecuta con normalidad el metodo
        } catch (Exception e) {//Bloque catch, al producirse una excepcion dentro de nuestro bloque catch en nuestro metodo, este se estaria ejecutando
            System.err.println("Excepcion en metodo ( ) ");//Mensaje del bloque catch
            e.printStackTrace();//Informacion del error
        }
    }

    private static int metodo() {//Creacion del metodo que retornara un tipo de dato primitivo entero
        int valor = 0;//Creacion de la variable entero llamada valor, inicializada en 0
        //Comienzo del bloque try-catch
        try {
            valor = valor + 1;//Operacion con variable valor
            valor = valor + Integer.parseInt("W");//Se produce la primera excepcion
            valor = valor + 1;//Al producirse una excepcion en la linea anterior del codigo, las lineas siguientes no se ejecutan.Entra al bloque catch dirctamente
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {//Se produce una interrupcion de nuestro codigo entra al bloque catch
            valor = valor + Integer.parseInt("W");//Se prodcuce una segunda excepcion, esta vez dentro de nuestro bloque catch
            System.out.println("Valor final del catch: " + valor);
        } finally {//Bloque finally siempre se ejecuta mas halla que se produzca una excepcion
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
        //Al producirce una excepcion dentro del bloque catch no se ejecuta las lineas siguientes del codigo
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}
