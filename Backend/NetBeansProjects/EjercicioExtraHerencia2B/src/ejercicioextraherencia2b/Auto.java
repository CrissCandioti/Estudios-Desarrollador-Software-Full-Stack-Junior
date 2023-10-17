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
public class Auto extends Vehiculos {    
    

    @Override
    public int calcularCostoDeCombustible() {
        return 7;
    }

    @Override
    public String toString() {
        return "Auto: " + "Marca: " + marca + ", Patente:" + patente + ", Combustibles: " + combustibles;
    }

}
