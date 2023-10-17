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

    public Vehiculos() {
    }

    public Vehiculos(String marca, String patente, Combustible combustibles) {
        this.marca = marca;
        this.patente = patente;
        this.combustibles = combustibles;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustibles() {
        return combustibles;
    }

    public void setCombustibles(Combustible combustibles) {
        this.combustibles = combustibles;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", patente=" + patente + ", combustibles=" + combustibles + '}';
    }

    public abstract int calcularCostoDeCombustible();

}
