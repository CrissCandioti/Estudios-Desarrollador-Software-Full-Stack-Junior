/*
 En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos adicionales:
 avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería suficiente.
 bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor menor o igual a cero.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Robot de nombre “Tito”
Luego utilizando sus métodos:
b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
8)
 */
package ejercicio7encuentro4;

/**
 *
 * @author Criss Candioti
 */
public class Robot {

    private String nombre;
    public static double bateria = 500;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanzar(int pasos) {
        double consumo = pasos * 10 / 100;
        while (true) {
            if (bateria <= 0) {
                System.out.println("Al robot tito no le queda mas bateria para continuar");
                System.out.println("Recorrio en distancia " + pasos + " pasos");
                break;
            } else {
                bateria = bateria - consumo;
                System.out.println("Al robot tito le queda bateria " + bateria + " para continuar");
            }
        }
    }

    public boolean bateriaVacia() {
        return bateria <= 0;
    }
}
