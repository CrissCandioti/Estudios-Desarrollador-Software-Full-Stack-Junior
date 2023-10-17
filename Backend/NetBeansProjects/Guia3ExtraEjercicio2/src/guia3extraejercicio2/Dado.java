/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extraejercicio2;

/**
 *
 * @author Criss Candioti
 */
public class Dado {

    private int numero;

    public Dado() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dado{" + "numero=" + numero + '}';
    }

    public void generarNro() {
        this.numero = (int) (Math.random() * 6 + 1);
    }

    public int verNro() {
        return this.numero;
    }
}
