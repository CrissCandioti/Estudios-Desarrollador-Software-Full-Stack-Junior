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
public class Viaje {

    private String lugarOrigen;
    private String lugarDestino;
    private int distanciaCuidades;
    private int cantidadPeaje;
    private Vehiculos vehiculos;

    public Viaje() {
    }

    public Viaje(String lugarOrigen, String lugarDestino, int distanciaCuidades, int cantidadPeaje, Vehiculos vehiculos) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.distanciaCuidades = distanciaCuidades;
        this.cantidadPeaje = cantidadPeaje;
        this.vehiculos = vehiculos;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public int getDistanciaCuidades() {
        return distanciaCuidades;
    }

    public void setDistanciaCuidades(int distanciaCuidades) {
        this.distanciaCuidades = distanciaCuidades;
    }

    public int getCantidadPeaje() {
        return cantidadPeaje;
    }

    public void setCantidadPeaje(int cantidadPeaje) {
        this.cantidadPeaje = cantidadPeaje;
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double costopeaje() {
        if (this.vehiculos instanceof Auto || this.vehiculos instanceof Camioneta) {

            return this.getCantidadPeaje() * 150;
        } else if (this.vehiculos instanceof Camion) {
 
            return this.getCantidadPeaje() * 300;
        }
        return 0;
    }

    public double costoCombustible() {
        if (this.vehiculos instanceof Auto) {
            return this.vehiculos.calcularCostoDeCombustible(this.getDistanciaCuidades());

        } else if (this.vehiculos instanceof Camioneta) {
            return this.vehiculos.calcularCostoDeCombustible(this.getDistanciaCuidades());

        } else if (this.vehiculos instanceof Camion) {
            return this.vehiculos.calcularCostoDeCombustible(this.getDistanciaCuidades());
        }
        return 0;
    }

    public int total() {

        return (int) (costopeaje() + costoCombustible());
    }
}
