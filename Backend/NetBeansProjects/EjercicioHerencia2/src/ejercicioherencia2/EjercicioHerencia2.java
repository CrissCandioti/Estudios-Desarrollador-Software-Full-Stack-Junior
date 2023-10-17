/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia2;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lavadora lav = new Lavadora(31, 9, "blanco", 'a', 15);
        lav.comprobarColor(lav.getColor()); //Llamamos al metodo para comprobar el color, si este argumento es incorrecto tendra determinado 'Blanco'
        lav.comprobarConsumoEnergetico(lav.getConsumoEnergetico()); //Llamamos al metodo para comprobar el consumo, si este argumento es incorrecto tendra determinado 'F'
        lav.precioFinal();
        System.out.println(lav);

        Televisor tele = new Televisor(41, true, 1, "blanco", 'a', 15);
        tele.comprobarColor(tele.getColor());//Llamamos al metodo para comprobar el color, si este argumento es incorrecto tendra determinado 'Blanco'
        tele.comprobarConsumoEnergetico(tele.getConsumoEnergetico());//Llamamos al metodo para comprobar el consumo, si este argumento es incorrecto tendra determinado 'F'
        tele.precioFinal();
        System.out.println(tele);

    }

}
