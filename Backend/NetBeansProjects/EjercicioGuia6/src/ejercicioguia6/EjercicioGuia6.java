/*
1. Demuestre como provocar intencionalmente una excepción del tipo
NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
error.
 */
package ejercicioguia6;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioGuia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            EjercicioGuia6.largo();
        } catch (NullPointerException aux) {
            System.out.println("Valor nulo");
            System.out.println(aux.fillInStackTrace());
            System.out.println(aux.getMessage());
        } finally {
            System.out.println("Saliendo del try-catch");
        }

    }

    public static void largo() throws NullPointerException,NullPointerException {
        String n1 = null;
        System.out.println("Largo de la palabra: " + n1.length());

    }

}
