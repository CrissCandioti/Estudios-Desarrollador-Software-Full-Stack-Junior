package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Jugador arquero = new Jugador();
        arquero.nombre="Juan";
        arquero.puntaje=140;
        arquero.edad=24;
        arquero.nacionalidad="Argentina";
        System.out.println(arquero.nombre+" "+arquero.puntaje+" "+arquero.edad+" "+arquero.nacionalidad);

    }

}
