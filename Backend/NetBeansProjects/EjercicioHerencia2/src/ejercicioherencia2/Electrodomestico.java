/*

 */
package ejercicioherencia2;

/**
 *
 * @author Criss Candioti
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return Character.toUpperCase(consumoEnergetico);
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String colors) {
        if (colors == "blanco" || colors == "negro" || colors == "rojo" || colors == "azul" || colors == "gris") {
            this.color = colors;
        } else {
            this.color = "blanco";
        }
    }

    public void precioFinal() {
        //ConsumoA
        if (this.getConsumoEnergetico() == 'A' && (this.peso >= 1 && this.peso <= 19)) {
            this.setPrecio(this.getPrecio() + 1100);
        } else if (this.getConsumoEnergetico() == 'A' && (this.peso >= 20 && this.peso <= 49)) {
            this.setPrecio(this.getPrecio() + 1500);
        } else if (this.getConsumoEnergetico() == 'A' && (this.peso >= 50 && this.peso <= 79)) {
            this.setPrecio(this.getPrecio() + 1800);
        } else if (this.getConsumoEnergetico() == 'A' && this.peso >= 80) {
            this.setPrecio(this.getPrecio() + 2000);
        }
        //ConsumoB
        if (this.getConsumoEnergetico() == 'B' && (this.peso >= 1 && this.peso <= 19)) {
            this.setPrecio(this.getPrecio() + 900);
        } else if (this.getConsumoEnergetico() == 'B' && (this.peso >= 20 && this.peso <= 49)) {
            this.setPrecio(this.getPrecio() + 1300);
        } else if (this.getConsumoEnergetico() == 'B' && (this.peso >= 50 && this.peso <= 79)) {
            this.setPrecio(this.getPrecio() + 1600);
        } else if (this.getConsumoEnergetico() == 'B' && this.peso >= 80) {
            this.setPrecio(this.getPrecio() + 1800);
        }
        //ConsumoC
        if (this.getConsumoEnergetico() == 'C' && (this.peso >= 1 && this.peso <= 19)) {
            this.setPrecio(this.getPrecio() + 700);
        } else if (this.getConsumoEnergetico() == 'C' && (this.peso >= 20 && this.peso <= 49)) {
            this.setPrecio(this.getPrecio() + 1100);
        } else if (this.getConsumoEnergetico() == 'C' && (this.peso >= 50 && this.peso <= 79)) {
            this.setPrecio(this.getPrecio() + 1400);
        } else if (this.getConsumoEnergetico() == 'C' && this.peso >= 80) {
            this.setPrecio(this.getPrecio() + 1600);
        }
        //ConsumoD
        if (this.getConsumoEnergetico() == 'D' && (this.peso >= 1 && this.peso <= 19)) {
            this.setPrecio(this.getPrecio() + 600);
        } else if (this.getConsumoEnergetico() == 'D' && (this.peso >= 20 && this.peso <= 49)) {
            this.setPrecio(this.getPrecio() + 1000);
        } else if (this.getConsumoEnergetico() == 'D' && (this.peso >= 50 && this.peso <= 79)) {
            this.setPrecio(this.getPrecio() + 1300);
        } else if (this.getConsumoEnergetico() == 'D' && this.peso >= 80) {
            this.setPrecio(this.getPrecio() + 1500);
        }
        //ConsumoE
        if (this.getConsumoEnergetico() == 'E' && (this.peso >= 1 && this.peso <= 19)) {
            this.setPrecio(this.getPrecio() + 400);
        } else if (this.getConsumoEnergetico() == 'E' && (this.peso >= 20 && this.peso <= 49)) {
            this.setPrecio(this.getPrecio() + 800);
        } else if (this.getConsumoEnergetico() == 'E' && (this.peso >= 50 && this.peso <= 79)) {
            this.setPrecio(this.getPrecio() + 1100);
        } else if (this.getConsumoEnergetico() == 'E' && this.peso >= 80) {
            this.setPrecio(this.getPrecio() + 1300);
        }
        //ConsumoF
        if (this.getConsumoEnergetico() == 'F' && (this.peso >= 1 && this.peso <= 19)) {
            this.setPrecio(this.getPrecio() + 200);
        } else if (this.getConsumoEnergetico() == 'F' && (this.peso >= 20 && this.peso <= 49)) {
            this.setPrecio(this.getPrecio() + 600);
        } else if (this.getConsumoEnergetico() == 'F' && (this.peso >= 50 && this.peso <= 79)) {
            this.setPrecio(this.getPrecio() + 900);
        } else if (this.getConsumoEnergetico() == 'F' && this.peso >= 80) {
            this.setPrecio(this.getPrecio() + 1100);
        }
    }

}
