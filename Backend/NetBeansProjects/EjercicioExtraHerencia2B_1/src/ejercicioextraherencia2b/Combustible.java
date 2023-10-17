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
public class Combustible {

    private String tipoCombustible;
    private int precio;

    public Combustible() {
    }

    public Combustible(String tipoCombustible, int precio) {
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tipo de Combustible: " + tipoCombustible;
    }

}
