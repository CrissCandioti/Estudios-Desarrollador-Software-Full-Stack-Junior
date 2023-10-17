/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones6;

/**
 *
 * @author Criss Candioti
 */
public class Producto {

    protected int codigo;
    protected String descripcion;
    protected String marca;
    protected int precioLista;
    protected int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, String marca, int precioLista, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + "Codigo: " + codigo + ", Descripcion: " + descripcion + ", Marca: " + marca + ", Precio deL ista: " + precioLista + ", Stock: " + stock;
    }

    public int calcularPrecioPublico() {
        int precioFinal = 0;
        return precioFinal;
    }

}
