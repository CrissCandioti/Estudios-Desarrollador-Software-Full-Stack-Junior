/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraherencia2b;

/**
 *
 * @author Criss Candioti
 */
public class Camion extends Vehiculos {    
    

    @Override
    public int calcularCostoDeCombustible() {
        return 12;
    }

    @Override
    public String toString() {
        return "Camion: " + "Marca: " + marca + ", Patente:" + patente + ", Combustibles: " + combustibles;
    }

}
