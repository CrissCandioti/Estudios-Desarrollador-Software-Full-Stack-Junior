/*

 */
package ejerciciocolecciones5;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColecciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio c = new Colegio();
        c.generadorAlumno();
        System.out.println("----------");
        c.eliminar();
        System.out.println("----------");
        c.mostrar();
        System.out.println("----------");
        c.mostrarPorLetra();
    }
}
