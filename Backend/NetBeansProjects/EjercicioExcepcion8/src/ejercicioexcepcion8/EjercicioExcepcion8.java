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
public class EjercicioExcepcion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dentro de un bloque try-catch en las lineas de instrucciones del try tendremos nuestra funcion creada anteriormente llamada (metodo).
        //Si se produce una interrupcion se ejecuta nuestro catch
        try {
            System.out.println(metodo());//Debido a que no se produce ninguna excepcion el programa se ejecuta con normalidad
        } catch (Exception e) {//Bloque catch, no se produjo ninguna excepcion, por lo tanto los codigos dentro de catch no se ejecutan.
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }

    private static int metodo() { //Metodo statico creado, con llamar a la clase y al metodo ejecitamos al metodo.Recordemos que es una funcion, retornara un valor
        int valor = 0;//Crea una variable llamada "valor" y se inicializa en cero.
        try {//Crea Bloque try-catch
            valor = valor + 1;//Operacion con valor
            valor = valor + Integer.parseInt("2");//Operacion con valor, es valida porque dentro de parseint tenemos un numero.
            valor = valor + 1;//Operacion con valor
            System.out.println("Valor final del try :" + valor);//Operacion con valor
        } catch (NumberFormatException e) {//Bloque catch en la cual no entra, debido a que dentro de nuestro try no se produce ninguna excepcion
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  :" + valor);
        } finally {//Bloque finally que siempre se ejecuta
            valor = valor + 1;//Operacion con valor
            System.out.println("Valor final del finally: " + valor);//Mensaje por pantalla
        }
        valor = valor + 1;//Operacion con valor
        System.out.println("Valor antes del return: " + valor);//Ultimo mensaje de nuestro metodo
        return valor;//retorna el valor final de nuestra variable
    }
    
}
