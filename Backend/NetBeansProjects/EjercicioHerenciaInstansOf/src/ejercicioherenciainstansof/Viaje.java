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
public class Viaje {

    private String origen;
    private String destino;
    private Vehiculo vehiculo;

    public Viaje(String origen, String destino, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void seleccion() {
        if (this.vehiculo instanceof Auto) {
            System.out.println("Seleccion un auto");
            System.out.println(this.getVehiculo());
        } else if (this.vehiculo instanceof Camioneta) {
            System.out.println("Seleccion una camioneta");
            System.out.println(this.getVehiculo());
        }
    }
}
