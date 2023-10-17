/*
 En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
 dibujaCuadrado(): Este método recibe un número entero N, y dibujará un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el mayor. En caso de ser iguales lo deberá informar.
 elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que corresponderá a un día de la semana, retornando el nombre que le corresponda, por ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7 Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de Utilitario:
a) Dibujar un cuadrado de 5 elementos.
b) Mostrar el mayor entre (20,75 y 40)
c) Mostrar el nombre del día 5.
6)
 */
package ejercicio5encuentro4;

public class Ejercicio5Encuentro4 {

    public static void main(String[] args) {

        Utilitario cuadrado = new Utilitario();
        Utilitario.dibujaCuadrado();
        Utilitario.elMayorEs(20, 75, 40);
        Utilitario.elDiaEs();
    }

}
