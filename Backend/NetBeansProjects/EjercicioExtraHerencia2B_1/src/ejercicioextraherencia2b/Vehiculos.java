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
public abstract class Vehiculos {

    protected String marca;
    protected String patente;
    protected Combustible combustibles;

    public Vehiculos(String marca, String patente, Combustible combustibles) {
        this.marca = marca;
        this.patente = patente;
        this.combustibles = combustibles;
    }

    public abstract int calcularCostoDeCombustible(int distanciaCuidades);

}
