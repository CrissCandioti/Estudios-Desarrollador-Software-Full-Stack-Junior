/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepcionesegg;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcionesEGG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();//Instanciamos el objeto de la clase persona.
        p1 = null;//A nuestro objeto instanciado, le asignamos valores nulos.

        try {//Utilizamos un try-catch, en sus instrucciones tendra el metodo de la clase persona "EsMayorDeEdad()".
            p1.esMayorDeEdad();
        } catch (NullPointerException a) {//Al no tener valores el objeto instanciado, entramos al bloque catch, (pueden existir mas bloques catch con distintas excepciones).
            System.out.println("El objeto persona no tiene ningun dato almacenado");//Entra al unico bloque catch, donde se instancia un objeto de la clase excepcion.Podemos mostrar informacion del error, o un mensaje simple de la interrupcion del metodo.
        }

    }

}
