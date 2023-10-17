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

    public Camion(String marca, String patente, Combustible combustibles) {
        super(marca, patente, combustibles);
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
    public int calcularCostoDeCombustible(int distanciaCuidades) {
        return ((distanciaCuidades * 12) / 100) * this.combustibles.getPrecio();
    }

}
