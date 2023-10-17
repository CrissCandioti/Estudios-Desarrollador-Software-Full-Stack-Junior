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

public class Pensador {

    private int entero;

    public Pensador(int entero) {
        this.entero = entero;
    }

    private void setEntero(int entero) {
        this.entero = entero;
    }

    private int getEntero() {
        return entero;
    }

    public int invertir() {
        int invertido = 0;
        while (entero != 0) {
            invertido = (invertido * 10) + (entero % 10);
            entero = entero / 10;
        }

        return invertido;
    }

    public int parAntes() {
        int valor = entero;
        if (valor % 2 != 0) {
            valor = valor - 1;
        } else {
            valor = valor - 2;
        }
        return valor;
    }

    public int parPosterior() {
        int valor = entero;
        if (valor % 2 != 0) {
            valor = valor + 1;
        } else {
            valor = valor + 2;
        }
        return valor;
    }

    public int primerDigito() {
        
        while (entero > 10) {            
            entero = entero / 10;
        }
        return entero;
    }

    public int ultimoDigito() {
        return entero % 10;
    }
}
