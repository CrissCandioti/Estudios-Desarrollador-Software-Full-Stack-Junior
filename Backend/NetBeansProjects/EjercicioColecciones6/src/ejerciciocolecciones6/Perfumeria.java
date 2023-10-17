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
public class Perfumeria extends Producto {

    private int tamañoEnCC;

    public Perfumeria(int tamañoEnCC, int codigo, String descripcion, String marca, int precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamañoEnCC = tamañoEnCC;
    }

    public int getTamañoEnCC() {
        return tamañoEnCC;
    }

    public void setTamañoEnCC(int tamañoEnCC) {
        this.tamañoEnCC = tamañoEnCC;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(int precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Perfumeria: " + "Codigo: " + codigo + ", Descripcion: " + descripcion + ", Marca: " + marca + ", Precio deL ista: " + precioLista + ", Stock: " + stock + " , Tamaño en centímetros cúbicos: " + tamañoEnCC;
    }

    @Override
    public int calcularPrecioPublico() {
        if (this.getTamañoEnCC() > 100) {
            return (int) (this.getPrecioLista() * 1.20);
        } else {
            return this.getPrecioLista();
        }
    }
}
