/*

 */
package ejercicioextraherencia2;

/**
 *
 * @author Criss Candioti
 */
public class Viaje {

    private String lugarOrigen;
    private String lugarDestino;
    private double distanciaCiudades; //se conoce este dato si las ciudades no están sobre la misma ruta
    private boolean mismaRuta; //conocer si estan sobre la misma ruta
    private String tipocombustible;
    private Vehiculo V1;
    private int cantidadDePeaje;
    private int kmOrigen;
    private int kmDestino;

    public Viaje() {
    }

    public Viaje(String lugarOrigen, String lugarDestino, double distanciaCiudades, boolean mismaRuta, String tipocombustible, Vehiculo V1, int kmOrigen, int kmDestino) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.distanciaCiudades = distanciaCiudades;
        this.mismaRuta = mismaRuta;
        this.tipocombustible = tipocombustible;
        this.V1 = V1;
        this.kmOrigen = kmOrigen;
        this.kmDestino = kmDestino;
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

    public double getDistanciaCiudades() {
        return distanciaCiudades;
    }

    public void setDistanciaCiudades(double distanciaCiudades) {
        this.distanciaCiudades = distanciaCiudades;
    }

    public boolean isMismaRuta() {
        return mismaRuta;
    }

    public void setMismaRuta(boolean mismaRuta) {
        this.mismaRuta = mismaRuta;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public Vehiculo getV1() {
        return V1;
    }

    public void setV1(Vehiculo V1) {
        this.V1 = V1;
    }

    public int getCantidadDePeaje() {
        return cantidadDePeaje;
    }

    public void setCantidadDePeaje(int cantidadDePeaje) {
        this.cantidadDePeaje = cantidadDePeaje;
    }

    public int getKmOrigen() {
        return kmOrigen;
    }

    public void setKmOrigen(int kmOrigen) {
        this.kmOrigen = kmOrigen;
    }

    public int getKmDestino() {
        return kmDestino;
    }

    public void setKmDestino(int kmDestino) {
        this.kmDestino = kmDestino;
    }

    public double calculoDeDistancia() {
        if (mismaRuta) {
            return this.kmDestino - this.kmOrigen;
        } else {
            return this.distanciaCiudades;
        }
    }

    public double calculoPeaje() {
        this.cantidadDePeaje = 3;
        double costoDePeaje;
        if (V1 instanceof Auto || V1 instanceof Camioneta) { // compara con las clases hijas.
            costoDePeaje = this.cantidadDePeaje * 100;
        } else {
            costoDePeaje = this.cantidadDePeaje * 150;
        }
        return costoDePeaje;
    }

    public void costoEnCombustible() {
        System.out.println("El costo del combustible es: " + V1.calcularCostoDeCombustible(distanciaCiudades));
    }

    public double costoTotal() {
        double costoPeaje = calculoPeaje();
        double costoCombustible = V1.calcularCostoDeCombustible(distanciaCiudades);
        double costoTotal = costoPeaje + costoCombustible;
        return costoTotal;
    }
}

