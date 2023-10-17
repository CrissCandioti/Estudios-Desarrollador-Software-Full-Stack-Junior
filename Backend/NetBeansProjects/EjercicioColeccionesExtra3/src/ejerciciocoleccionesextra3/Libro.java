/*
La clase Libro debe guardar el título del libro, autor, número de
ejemplares y número de ejemplares prestados.
 */
package ejerciciocoleccionesextra3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int numeroDeEjemplaresPrestados;

    public Libro(String titulo, String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumeroDeEjemplaresPrestados() {
        return numeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(int numeroDeEjemplaresPrestados) {
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + this.numeroDeEjemplares;
        hash = 59 * hash + this.numeroDeEjemplaresPrestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.numeroDeEjemplares != other.numeroDeEjemplares) {
            return false;
        }
        if (this.numeroDeEjemplaresPrestados != other.numeroDeEjemplaresPrestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro: " + "Titulo: " + titulo + ", Autor=" + autor + ", Numeros De Ejemplares: " + numeroDeEjemplares + ", Numeros De Ejemplares Prestados: " + numeroDeEjemplaresPrestados;
    }

    public static void prestamo(HashSet<Libro> conjunto) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro que desea prestar");
        String busqueda = leer.nextLine();
        Iterator<Libro> it = conjunto.iterator();
        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getAutor().equals(busqueda)) {
                System.out.println("Se encontro el autor del libro");
                if (aux.getNumeroDeEjemplares() != 0) {
                    System.out.println("Prestaremos el libro");
                    it.remove();
                    conjunto.add(new Libro(aux.getTitulo(), aux.getAutor(), (aux.getNumeroDeEjemplares() - 1), (aux.getNumeroDeEjemplaresPrestados() + 1)));
                    break;
                } else {
                    System.out.println("No se puede prestar libros debido a que no dispone de mas ejemplares");
                }
                break;
            } else {
                System.out.println("No se encontro el autor");
                break;
            }
        }
    }

    public static void devolucion(HashSet<Libro> conjunto) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro que desea devolver");
        String devolucion = leer.nextLine();
        Iterator<Libro> it = conjunto.iterator();
        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getAutor().equals(devolucion)) {
                System.out.println("Se encontro el libro del autor");
                if (aux.getNumeroDeEjemplaresPrestados() != 0) {
                    System.out.println("Realizaremos la devolucion");
                    it.remove();
                    conjunto.add(new Libro(aux.getTitulo(), aux.getAutor(), (aux.getNumeroDeEjemplares() + 1), (aux.getNumeroDeEjemplaresPrestados() - 1)));
                    break;
                } else {
                    System.out.println("No se puede devolver el libro, debido a que no posee una copia para una devolucion");
                    break;
                }
            } else {
                System.out.println("No se encontro el autor del libro, no se puede proceder a la devolucion");
                break;
            }
        }
    }

    public static void mostrar(HashSet<Libro> conjunto) {
        System.out.println("Lista de libros");
        for (Libro aux : conjunto) {
            System.out.println(aux);
        }
    }

}
