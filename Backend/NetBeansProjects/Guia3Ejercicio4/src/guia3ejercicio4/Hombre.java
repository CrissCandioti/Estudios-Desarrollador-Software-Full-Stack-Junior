/*
Por otro lado el Hombre sabe:
• JugarConRobot(Robot) Este método recibe por parámetro un Robot y con hace lo siguiente:
 Hacer que el Robot Avance 500 pasos.
 El robot Retroceda 20 pasos.
 Informe por pantalla cuanta energía tiene el robot Actualmente.
 Ponga el robot a dormir.
 */
package guia3ejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class Hombre {

    private Robot robot1;

    public Hombre() {
    }

    public Hombre(Robot robot1) {
        this.robot1 = robot1;
    }

    public Robot getRobot1() {
        return robot1;
    }

    public void setRobot1(Robot robot1) {
        this.robot1 = robot1;
    }

    @Override
    public String toString() {
        return "Hombre{" + "robot1=" + robot1 + '}';
    }

    public void JugarConRobot(Robot robot) {
        this.robot1.avanzar(500);
        this.robot1.retroceder(20);
        System.out.println("El estado actual de la bateria es: " + this.robot1.energiaActual());
        this.robot1.dormir();
    }
}
