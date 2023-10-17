/*
Demuestre como provocar intencionalmente una excepción del tipo
ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango); luego agregue las
sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
 */
package ejercicioexcepcion2;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int[] arregloV = new int[2];
            arregloV[0] = 10;
            arregloV[1] = 100;
            arregloV[2] = 1000;
            for (int i = 0; i < arregloV.length; i++) {
                System.out.println(arregloV[i]);
            }
        } catch (ArrayIndexOutOfBoundsException aux) {
            System.out.println("Indice de arreglo fuera de rango");
            System.out.println(aux.fillInStackTrace());
        }
    }
}
