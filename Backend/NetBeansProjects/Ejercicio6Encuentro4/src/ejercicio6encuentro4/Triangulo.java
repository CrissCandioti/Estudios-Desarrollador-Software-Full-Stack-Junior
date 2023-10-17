/*
En un nuevo proyecto, crear una clase de nombre Triangulo con los atributos: lado1, lado2, lado3; un constructor que permita inicializar sus atributos; los métodos getter y setter; y los siguientes métodos adicionales:
 esUnTriangulo(): Sabiendo que la regla principal que da origen al triángulo tiene que ver con la longitud de sus lados. Esta plantea que la suma de dos de sus lados debe ser mayor a la longitud del tercer lado. Por lo tanto si los valores de los lados de este triángulo cumplen con la regla este método retornará true caso contrario false.
 tipoTriangulo(): Si es un triángulo y tiene sus tres lados iguales, este método retornará equilátero; si sus tres lados son distintos, retornará “escaleno”; caso contrario, es decir, si sólo dos de sus lados son iguales, retornará “isósceles”; en el caso de que no sea un triángulo, retornará “Con sus lados no se puede representar un triángulo!!!”
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Triángulo válido.
Luego utilizando sus métodos:
b) Mostrar por consola que tipo de triángulo es.
c) Crear un objeto Triángulo inválido.
Luego utilizando sus métodos:
d) Mostrar por consola que tipo de triangulo es.
 */
package ejercicio6encuentro4;

public class Triangulo {

    public int lado1;
    public int lado2;
    public int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public void esUnTriangulo() {
        if (lado1 + lado2 > lado3) {
            System.out.println("La suma de sus lados es mayor a la del lado 3");
        } else {
            System.out.println("La suma de sus lados es menor a la del lado 3");
        }
    }

    public void tipoTriangulo() {
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            System.out.println("Es un triangulo equilatero, tiene todos sus lados iguales");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("Todos suss lados son distintos,es un triangulo escaleno");
        } else if (lado1 == lado2) {
            System.out.println("Tiene dos de sus lados iguales, es un isoceles");
        }
    }
}
