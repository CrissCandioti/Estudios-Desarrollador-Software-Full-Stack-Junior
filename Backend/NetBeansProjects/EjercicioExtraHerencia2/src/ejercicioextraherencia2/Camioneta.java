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
public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, String combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible(double distancia) {
        double consumoDeCombustible = 10;
        return ((consumoDeCombustible * distancia) / 100) * 250;
    }

}
