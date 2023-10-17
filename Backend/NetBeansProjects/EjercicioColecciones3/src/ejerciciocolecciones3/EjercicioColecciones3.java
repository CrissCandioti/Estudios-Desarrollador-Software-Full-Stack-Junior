/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones3;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cine c = new Cine("ROMA SRL", "Rivadavia 325");
        System.out.println("Bienvenidos, cuantas peliculas desea agregar?");
        int respuesta = leer.nextInt();
        for (int i = 0; i < respuesta; i++) {
            c.agregarPelicula();
        }
        System.out.println("--------------------");
        System.out.println("Ingrese las peliculas que desea filtrar por duracion mayor a la ingresada");
        int duracion = leer.nextInt();
        c.listarDuranMas(duracion);
        System.out.println("--------------------");
        System.out.println("Listar todo");
        c.listarTodo();
        System.out.println("--------------------");
        System.out.println("Ordenadas Por Titulo A-Z");
        c.listarOrdenadasPorTituloAZ();
        System.out.println("--------------------");
        System.out.println("Ordenadas Por Director A-Z");
        c.listarOrdenadasPorDirectorAZ();
        System.out.println("--------------------");
        System.out.println("Menor Duracion A Mayor Duracion");
        c.listarMenorDuracionAMayorDuracion();
    }

}
