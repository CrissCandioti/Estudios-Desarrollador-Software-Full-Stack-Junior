/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra1p;

/**
 *
 * @author Criss Candioti
 */
public class GPS {

    private String marca;
    private String modelo;
    private Posicion ultimaUbicacion;

    public GPS() {
    }

    public GPS(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    public Posicion getUltimaUbicacion() {
        return ultimaUbicacion;
    }

    public void setUltimaUbicacion(Posicion ultimaUbicacion) {
        this.ultimaUbicacion = ultimaUbicacion;
    }

    @Override
    public String toString() {
        return "GPS{" + "marca=" + marca + ", modelo=" + modelo + ", ultimaUbicacion=" + ultimaUbicacion + '}';
    }

    public Posicion obtenerUltimaPosicion() {

        return ultimaUbicacion;
    }

    public void mover() {
        Posicion posicion1 = new Posicion();
        posicion1.setLatitud(Math.random());
        posicion1.setLongitud(Math.random());
        this.ultimaUbicacion = posicion1;
    }
}
