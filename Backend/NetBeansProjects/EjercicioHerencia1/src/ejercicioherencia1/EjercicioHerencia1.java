/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
un mensaje por pantalla informando de que se alimenta. 
 */
package ejercicioherencia1;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Pocho", "Balanceado", 4, "Pincher");
        Gato gato = new Gato("Pomelo", "Pescado", 1, "Siames");
        Caballo caballo = new Caballo("Spirit", "Alfalfa", 10, "Salvaje");
        
        perro.queAlimento();
        gato.queAlimento();
        caballo.queAlimento();
    }

}
