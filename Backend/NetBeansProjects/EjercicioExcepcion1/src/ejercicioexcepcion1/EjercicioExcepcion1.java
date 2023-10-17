/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepcion1;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio c = new Colegio();
        c.setNombreInstitucion("Maria Carmen");
        try {
            c.añadir(c.generarPersona());
        } catch (NullPointerException aux) {
            System.out.println("ArrayList no inicializada, imposibilita guardar datos");
            System.out.println("Tipo de excepcion: " + aux.fillInStackTrace());
        }
        try {
            c.mostrar();
        } catch (NullPointerException aux) {
            System.out.println("ArrayList no inicializada, imposibilita mostrar los datos datos");
            System.out.println("Tipo de excepcion: " + aux.fillInStackTrace());
        }
    }

}
