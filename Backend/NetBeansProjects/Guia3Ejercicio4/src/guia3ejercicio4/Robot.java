/*
Disponemos de 3 objetos conocidos: un Hombre, un Robot y una Bateria; sabemos que el Robot reconoce las órdenes:
• Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos)
• Dormir()
• Despertar()
• Recargar()
• bateriaLLena():boolean
• bateriaVacia() :boolean
• energiaActual() :int
También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada vez que avanza o retrocede por cada 100 pasos pierde 10 unidades además si damos la orden al robot de dormir, no responderá al avanzar o retroceder hasta despertarlo.
Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.
 */
package guia3ejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class Robot {

    private int pasos;
    private Bateria estadoBateria;
    private boolean dormir = false;
    private boolean despertar = true;

    public Robot() {
    }

    public Robot(Bateria estadoBateria) {
        this.estadoBateria = estadoBateria;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public Bateria getEstadoBateria() {
        return estadoBateria;
    }

    public void setEstadoBateria(Bateria estadoBateria) {
        this.estadoBateria = estadoBateria;
    }

    public boolean isDormir() {
        return dormir;
    }

    public void setDormir(boolean dormir) {
        this.dormir = dormir;
    }

    public boolean isDespertar() {
        return despertar;
    }

    public void setDespertar(boolean despertar) {
        this.despertar = despertar;
    }

    @Override
    public String toString() {
        return "Robot{" + "pasos=" + pasos + ", estadoBateria=" + estadoBateria + ", dormir=" + dormir + ", despertar=" + despertar + '}';
    }

    public void avanzar(int pasos) {
        if (this.despertar == true && this.dormir == false) {
            System.out.println("El robot avanza " + pasos + " pasos.");
            int restoBateria = (pasos * 10) / 100;
            this.estadoBateria.setCarga(estadoBateria.getCarga() - restoBateria);
            
        } else if (this.despertar == false && this.dormir == true) {
            System.out.println("El robot esta durmiendo");
            System.out.println("Hasta despertarlo no se puede ejecutar ninguna accion");
        }
    }

    public void retroceder(int pasos) {
        if (this.despertar == true && this.dormir == false) {
            System.out.println("El robot retrocede " + pasos + " pasos.");
            int restoBateria = (pasos * 10) / 100;
            this.estadoBateria.setCarga(estadoBateria.getCarga() - restoBateria);

        } else if (this.despertar == false && this.dormir == true) {
            System.out.println("El robot esta en modo de reposo");
            System.out.println("Hasta despertarlo no se puede ejecutar ninguna accion");
        }

    }

    public void dormir() {
        System.out.println("El robot esta en modo de resposo");
        System.out.println("Hasta no despertarlo no realizara ninguna accion");
        this.despertar = false;
        this.dormir = true;
    }

    public void despertar() {
        System.out.println("El robot salio del modo de reposo");
        System.out.println("El robot respondera todas sus instrucciones");
        this.despertar = true;
        this.dormir = false;
    }

    public void recargar() {
        System.out.println("El estado actual de la bateria es: " + this.getEstadoBateria());
        System.out.println("Ahora mismo recargaremos la bateria");
        this.estadoBateria.setCarga(1000);
        System.out.println("La bateria a sido recargada, esta al maximo de su capacidad");
        System.out.println("Su nuevo estado es :" + this.estadoBateria);
    }

    public boolean bateriaLLena() {
        return this.estadoBateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return this.estadoBateria.getCarga() == 0 || this.estadoBateria.getCarga() < 1000;
    }

    public int energiaActual() {
        return this.estadoBateria.getCarga();
    }
    
}
