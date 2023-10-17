/*
 10) En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para dicho atributo y los siguientes métodos adicionales:
 invertir(): Este método retornará el valor guardado en el atributo con sus cifras invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
 parAntes(): Este método retornará el valor par próximo anterior al valor guardado.
 parPosterior(): Este método retornará el valor par próximo posterior al valor guardado.
 primerDigito(): Este método retornará el primer dígito del valor guardado.
 ultimoDigito(): Este método retornará el último dígito del valor guardado.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
 */
package ejercicio10encuentro4;

import java.util.Scanner;

public class Ejercicio10Encuentro4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pensador x = new Pensador(3915);
        System.out.println(x.invertir());
        System.out.println(x.parAntes());
        System.out.println(x.parPosterior());
        System.out.println(x.primerDigito());
        System.out.println(x.ultimoDigito());
    }

}
