/*
La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite inicializar su carga y los métodos get y set para dicho atributo.
 */
package guia3ejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class Bateria {

    private int carga;

    public Bateria() {
    }

    public Bateria(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Bateria{" + "carga=" + carga + '}';
    }
    
}
