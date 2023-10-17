/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al
constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si
tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se
incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar
al precio.
 */
package ejercicioherencia2;

/**
 *
 * @author Criss Candioti
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //Llamamos al metodo heredado de la clase padre para calcular una parte del monto.
        //A continuacion utilizamos el monto calculado del metodo de la clase padre almacenada en la variable precio, para agregar una operacion mas propia de la clase hija o subclase.
        if (this.carga > 30) {
            System.out.println("El producto tiene una carga mayor de los 30 kg establecidos. Aumentaremos el precio $500");
            this.precio += 500;
        } else if (this.carga <= 30) {
            System.out.println("El producto tiene una carga igual o menor a 30 kg, cumple con las condiciones establecidas, no aumentaremos el precio");
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", carga=" + carga + '}';
    }
}
