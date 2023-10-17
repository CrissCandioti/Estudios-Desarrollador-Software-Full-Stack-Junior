/*
En un nuevo proyecto, crear una clase de nombre Circulo, con los atributos PI que es una constante con el valor 3.14 y radio; un constructor que permita inicializar el radio del círculo; los métodos “get” y “set” para radio y los siguientes métodos adicionales:
 calcularArea(): este método retornará la superficie del círculo.
 calcularPerímetro(): este método retornará el perímetro del círculo.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Circulo con radio 5.75 ;
Luego utilizando sus métodos:
b) Mostrar por consola su perímetro
c) Mostrar por consola su superficie.
 */
package ejercicio3encuentro4;

public class Circulo {

    private static final double PI = 3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double calcularArea(){
    return PI * (radio * radio);
    }
    
    public double calcularPerímetro(){
        return (2 * PI) * radio; 
    }
}
