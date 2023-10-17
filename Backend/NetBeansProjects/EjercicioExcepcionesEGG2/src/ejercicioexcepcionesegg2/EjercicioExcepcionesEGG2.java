/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
 */
package ejercicioexcepcionesegg2;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcionesEGG2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloV = new int[5]; //Creamos nuestro arreglo con un limite de 5 indices.Recordemos que los arreglos comienzan en 0;
        //Dentro de un bloque Try-Catch, asignaremos los valores a nuestro arreglo, si se excede de lo establecido previamente.Dentro del bloque catch tendremos la excepcion que puede ocacionar dicha excepcion
        try {
            for (int i = 0; i < 10; i++) {//El limite de nuestro arreglo es 5; nuestro bucle for recorrera 10 y almacenara cada vez que recorra.
                arregloV[i] = i;//A medida que recorra asigaremos los valores del arreglo.
                System.out.println("Arreglo: " + arregloV[i]);//Si las instrucciones se ejecutarian sin problemas con mostrar el mensaje terminariamos.
            }
        } catch (ArrayIndexOutOfBoundsException e) {//Bloque catch con la excepcion
            System.out.println("Los valores asignados superan el limite de nuestro arreglo");//Mensaje que podremos mostrar
            System.out.println(e.getMessage());//Como se crea un objeto de la clase Excepcion, con dicho objeto podremos mostrar la informacion que querramos.
        }
    }

}
