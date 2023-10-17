/*
Clase Juego: esta clase posee los siguientes atributos: 2 Jugadores y Revolver

Métodos:
• llenarJuego(Jugador jugador1,Jugador jugador2, Revolver r): este método recibe los 2 jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el
gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se
debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los
atributos de la clase Juego.
 */
package guia3extraejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class Juego {

    private Jugador jugador1;
    private Jugador jugador2;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(Jugador jugador1, Jugador jugador2, RevolverDeAgua revolver) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.revolver = revolver;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", revolver=" + revolver + '}';
    }

    public void ronda() {
        System.out.println("Bienvenidos a nuestra app de una ruleta rusa pero de agua!");
        System.out.println("A continuacion presentaremos a nuestro dos competidores");
        System.out.println("Primer jugador");
        System.out.println("Nomgre: " + this.jugador1.getNombre() + "  ID: " + this.jugador1.getID());
        System.out.println("Segundo jugador");
        System.out.println("Nombre: " + this.jugador2.getNombre() + "  ID: " + this.jugador2.getID());
        while (true) {
            System.out.println("Mostraremos las ubicaciones del revolver");
            this.jugador1.disparo(this.revolver);
            if (this.revolver.getPosicionActual() == this.revolver.getPosicionAgua()) {
                System.out.println("El primer jugador se mojo");
                System.out.println("Finalizaremos el turno del jugador que perdio con las siguientes caracteristicas");
                this.jugador1.setMojarse("Mojado");
                System.out.println(this.jugador1);
                return;
            } else {
                System.out.println("Finalizaremos el turno del jugador con las siguientes caracteristicas");
                this.jugador1.setMojarse("No Mojado");
                System.out.println(this.jugador1);
                System.out.println("Segundo competidor");
                System.out.println("Ahora mostraremos las ubicaciones del revolver");
                this.jugador2.disparo(this.revolver);
                if (this.revolver.getPosicionActual() == this.revolver.getPosicionAgua()) {
                    System.out.println("El segundo jugador se mojo");
                    System.out.println("Finalizaremos el turno del jugador que perdio con las siguientes caracteristicas");
                    this.jugador2.setMojarse("Mojado");
                    System.out.println(this.jugador2);
                    return;
                } else {
                    System.out.println("Finalizaremos el turno del jugador con las siguientes caracteristicas");
                    this.jugador2.setMojarse("No Mojado");
                    System.out.println(this.jugador2);
                }
            }
        }
    }
}
