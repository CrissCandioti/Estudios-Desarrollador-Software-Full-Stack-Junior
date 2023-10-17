/*
 En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos estáticos:
 convertirAPesos(): recibe un valor en dólares y retorna convertido a pesos argentinos.
 convertirADolar(): recibe un valor en pesos argentinos y retorna convertido a dólar.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Conversor.
a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido.
 */
package ejercicio4encuentro4;

public class Conversor {

    public double pesos;
    public double dolar;

    public Conversor(double pesos, double dolar) {
        this.pesos = pesos;
        this.dolar = dolar;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public static double convertirAPesos(double pesos, double dolar) {
        return pesos * dolar;
    }

    public static double convertirADolar(double pesos, double dolar) {
        return pesos / dolar;
    }
}
