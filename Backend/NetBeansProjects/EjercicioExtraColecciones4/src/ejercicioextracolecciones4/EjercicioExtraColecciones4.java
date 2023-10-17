/*
4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página:
https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades. 
• Muestra por pantalla los datos
introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario. 
• Muestra por
pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap. 
• Elimina 3 ciudades
existentes dentro del HashMap, que pida el usuario. 
• Muestra por pantalla los datos.
 */
package ejercicioextracolecciones4;

import java.util.HashMap;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExtraColecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> ciudades = new HashMap<>();
        System.out.println("Ingrese 2 ciudades");
        Ciudad.generador(ciudades); //Metodo que genera 10 ciudades
        System.out.println("----------");
        Ciudad.mostrar(ciudades); //Metodo que muestra las key y value del mapa
        System.out.println("----------");
        Ciudad.busqueda(ciudades); //Metodo que por medio de un valor ingresado por el usuario se busca su key, se retornara su value si se encuentra
        System.out.println("----------");
        Ciudad.generarMapa(ciudades); //Metodo para generar solamente un codigo postal y una ciudad, luego lo almacena a la lista
        System.out.println("----------");
        Ciudad.eliminar(ciudades); //Metodo para eliminar una ciudad por medio de su codigo postal.
        Ciudad.eliminar(ciudades);
        Ciudad.eliminar(ciudades);
        System.out.println("----------");
        Ciudad.mostrar(ciudades); //Metodo que muestra las key y value del mapa
    }
}
