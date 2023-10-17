/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciainstansof;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioHerenciaInstansOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Renault", "3312", "2012");
        Vehiculo camioneta = new Camioneta("Dodge", "3313", "2021");
        Vehiculo camion = new Camion("Scania", "3314", "2023");
        
        Viaje viaje = new Viaje("Santa fe", "cordoba", camioneta);
        viaje.seleccion();
    }

}
