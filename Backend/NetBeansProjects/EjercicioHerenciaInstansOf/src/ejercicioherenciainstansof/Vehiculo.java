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
public class Vehiculo {

    protected String marca;
    protected String patente;
    protected String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String patente, String modelo) {
        this.marca = marca;
        this.patente = patente;
        this.modelo = modelo;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", patente=" + patente + ", modelo=" + modelo + '}';
    }

}
