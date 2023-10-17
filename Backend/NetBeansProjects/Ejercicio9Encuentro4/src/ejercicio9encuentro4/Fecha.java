/*
  En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes atributos: dia, mes, año; un constructor que permita inicializar a todos sus atributos; los métodos getter y setter para sus atributos y los siguientes métodos adicionales:
 esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto; caso contrario retornará false.
 calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que será la cantidad de años transcurridos entre esta Fecha y la que recibe por parámetro.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear dos objetos de tipo fecha.
Utilizando sus métodos:
b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
 */
package ejercicio9encuentro4;

import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean esBisiesto() {
        return año % 4 == 0 && (año % 100 != 0 || año % 400 == 0);
    }

    public int calcularAños(Fecha x) {
        int diferencia = 0;
        if (x.getMes() == this.mes) {
            if (x.getDia() <= this.dia) {
                diferencia = x.getAño() - this.año;
            } else {
                diferencia = x.getAño() - (this.año - 1);
            }
        } else if (x.getMes() > this.mes) {
            diferencia = x.getAño() - (this.año - 1);
        } else {
            diferencia = x.getAño() - this.año;
        }
        if (diferencia < 0) {
            return (diferencia * -1);
        } else {
            return diferencia;
        }
    }

    public void saber(Fecha y) {
        System.out.println("Estos son los get");
        System.out.println(y.getDia());
        System.out.println(y.getMes());
        System.out.println(y.getAño());
        System.out.println("Estos serian los this.");
        System.out.println(this.dia);
        System.out.println(this.mes);
        System.out.println(this.año);
    }

}
