/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está
mojado o no el jugador).

Métodos:

disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y
siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
el jugador se moja; por lo tanto el atributo mojado pasa a true, sino false.
 */
package guia3extraejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class Jugador {

    private int ID;
    private String nombre;
    private String mojarse;

    public Jugador() {
    }

    public Jugador(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMojarse() {
        return mojarse;
    }

    public void setMojarse(String mojarse) {
        this.mojarse = mojarse;
    }

    @Override
    public String toString() {
        return "" + "ID: " + ID + ", Nombre: " + nombre + " " + mojarse;
    }

    public void disparo(RevolverDeAgua r) {

        r.mojar();

        r.siguienteChorro();

        System.out.println(r.toString());
    }
}
