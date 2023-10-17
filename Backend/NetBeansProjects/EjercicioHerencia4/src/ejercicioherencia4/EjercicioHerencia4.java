/*
d) Luego en una clase TestHerencia, desde su método main se pide:
a. Crear un Guerrero de nombre “Thor” en la posición X=100, Y=200
b. Hacerlo girar hasta que mire al Oeste
c. Hacerlo Avanzar 5 pasos.
d. Hacerlo disparar 8 veces.
 */
package ejercicioherencia4;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioHerencia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Position p = new Position(100, 200);
        Guerrero thor = new Guerrero(p, "Criss");
        //thor.setCaballo(true);

        thor.avanzar();
        System.out.println("----------");
        thor.girar();
        System.out.println("----------");
        thor.disparar();

        System.out.println("----------");
        thor.avanzar();
        System.out.println("----------");
        thor.girar();
        System.out.println("----------");
        thor.disparar();

        System.out.println("----------");
        thor.avanzar();
        System.out.println("----------");
        thor.girar();
        System.out.println("----------");
        thor.disparar();

//        thor.girar();  
//        thor.avanzar();
//        thor.avanzar();       
//        thor.disparar();
//        thor.disparar();
//        thor.disparar();
//        thor.disparar();
//        thor.disparar();
    }

}
