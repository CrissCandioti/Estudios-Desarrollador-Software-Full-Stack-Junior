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
public class Ropa extends Producto {

    private String tipoDeTela;

    public Ropa(String tipoDeTela, int codigo, String descripcion, String marca, int precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoDeTela = tipoDeTela;
    }

    public String getTipoDeTela() {
        return tipoDeTela;
    }

    public void setTipoDeTela(String tipoDeTela) {
        this.tipoDeTela = tipoDeTela;
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
        return "Ropa: " + "Codigo: " + codigo + ", Descripcion: " + descripcion + ", Marca: " + marca + ", Precio deL ista: " + precioLista + ", Stock: " + stock + " , Tipo De Tela: " + tipoDeTela;
    }

    @Override
    public int calcularPrecioPublico() {
        return (int) (this.getPrecioLista() * 1.40);
    }

}
