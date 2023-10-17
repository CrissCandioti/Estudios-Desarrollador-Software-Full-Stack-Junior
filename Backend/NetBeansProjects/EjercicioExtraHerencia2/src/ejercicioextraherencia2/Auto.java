/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraherencia2;

/**
 *
 * @author Criss Candioti
 */
public class Auto extends Vehiculo {

    public Auto(String marca, String patente, String combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        double consumoDeCombustible = 7;
        return ((consumoDeCombustible * distancia) / 100) * 250;
    }

}
