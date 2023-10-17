/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición del
tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del tambor donde
se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben
ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor.
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package guia3extraejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;
    private boolean acierto;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    @Override
    public String toString() {
        return "Revolver De Agua: " + "Posicion Actual " + posicionActual + ", Posicion Agua " + posicionAgua;
    }

    public boolean mojar() {

        if (this.posicionActual == this.posicionAgua) {
            this.acierto = true;
        }

        return this.acierto;
    }

    public void siguienteChorro() {
        if (this.posicionActual == 6) {
            this.posicionActual = 1;

        } else {
            this.posicionActual += 1;
        }
    }
}
