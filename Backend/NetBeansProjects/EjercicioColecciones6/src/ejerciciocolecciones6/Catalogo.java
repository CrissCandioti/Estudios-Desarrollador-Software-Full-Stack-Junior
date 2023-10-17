/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones6;

import java.util.ArrayList;

/**
 *
 * @author Criss Candioti
 */
public class Catalogo {

    private ArrayList<Producto> catalogo = new ArrayList<>();

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public String toString() {
        return "Catalogo: " + "Catalogo: " + catalogo;
    }

    public void agregarProducto(Producto producto) {
        this.catalogo.add(producto);
    }

    public void mostrarCatalogoRopa() {
        for (Producto aux : catalogo) {
            if (aux instanceof Ropa) {
                Ropa index = (Ropa) aux;
                System.out.println(index);
                System.out.println("Calculo de precio publico");
                System.out.println(index.calcularPrecioPublico());
            }
        }
    }

    public void mostrarCatalogoElectrodomestico() {
        for (Producto aux : catalogo) {
            if (aux instanceof Electrodomesticos) {
                Electrodomesticos index = (Electrodomesticos) aux;
                System.out.println(index);
                System.out.println("Calculo de precio publico");
                System.out.println(index.calcularPrecioPublico());
            }
        }
    }

    public void mostrarCatalogoPerfumeria() {
        for (Producto aux : catalogo) {
            if (aux instanceof Perfumeria) {
                Perfumeria index = (Perfumeria) aux;
                System.out.println(index);
                System.out.println("Calculo de precio publico");
                System.out.println(index.calcularPrecioPublico());
            }
        }
    }

    public void cantidad() {
        int cantidadRopa = 0;
        int cantidadElectrodomestico = 0;
        int cantidadPerfumes = 0;
        for (int i = 0; i < this.catalogo.size(); i++) {
            if (this.catalogo.get(i) instanceof Ropa) {
                cantidadRopa += 1;
            }
            if (this.catalogo.get(i) instanceof Electrodomesticos) {
                cantidadElectrodomestico += 1;
            }
            if (this.catalogo.get(i) instanceof Perfumeria) {
                cantidadPerfumes += 1;
            }
        }
        System.out.println("Cantidad de ropa almacenada: " + cantidadRopa);
        System.out.println("Cantidad de electrodomesticos almacenados: " + cantidadElectrodomestico);
        System.out.println("Cantidad de perfumes almacenados: " + cantidadPerfumes);
    }
}
