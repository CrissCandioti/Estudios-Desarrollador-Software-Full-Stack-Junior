package ejercicioherencia2;

/**
 *
 * @author Criss Candioti
 */
public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //Llamamos al metodo de la clase padre (clase Electrodomestico), para resolver una parte del trabajo.
        //Ahora utilizamos un metodo de la propia clase televisor.
        if (this.pulgadas > 40 && this.tdt == true) {
            System.out.println("El televisor al tener mas de 40 pulgadas se le incrementara el precio un 30% ");
            this.setPrecio(this.getPrecio() * 1.30);
            System.out.println("Al tener un Sintonizador TDT incorporado tambien incrementaremos el precio unos $500");
            this.setPrecio(this.getPrecio() + 500);
        } else if (this.pulgadas < 40 && this.tdt == true) {
            System.out.println("El televisor al tener menos de 40 pulgadas no le aumentaremos el precio");
            System.out.println("Al tener un Sintonizador TDT incorporado tambien incrementaremos el precio unos $500");
            this.setPrecio(this.getPrecio() + 500);
        } else {
            System.out.println("Al no tener mas 40 pulgadas y no tener un sintonizador TDT no aumentaremos el precio");
        }
    }
    
        @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", pulgadas=" + pulgadas + ", tdt=" + tdt + '}';
    }  

}
