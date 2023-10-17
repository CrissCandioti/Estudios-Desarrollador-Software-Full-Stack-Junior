//En un nuevo proyecto para un juego de ajedrez, nos piden modelar e implementar una clase que representa una Pieza de dicho juego. Usted deberá pensar que atributos serían necesarios para describir las características de dicha clase, agregarle los métodos getter y setter correspondientes y luego probar desde el main de la clase principal del proyecto.
package ejercicio5;

public class Pieza {

    private String modelo;
    private String movilidad;
    private String valor;
    
    public Pieza(){}
    
    public Pieza(String modelo,String movilidad,String valor){
    this.modelo=modelo;
    this.movilidad=movilidad;
    this.valor=valor;
    }
    
    public String getModelo(){
    return modelo;
    }
    
    public void setModelo(String modelo){
    this.modelo=modelo;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pieza{" + "modelo=" + modelo + ", movilidad=" + movilidad + ", valor=" + valor + '}';
    }
    
    
}
