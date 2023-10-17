/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden2;

/**
 *
 * @author Criss Candioti
 */
public class Auto implements Comparable<Auto> {

    private String marca;
    private String modelo;
    private int año;

    public Auto() {
    }

    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Auto: " + "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año;
    }

    @Override
    public int compareTo(Auto index) {
        return this.getAño() - index.año;
    }
}
