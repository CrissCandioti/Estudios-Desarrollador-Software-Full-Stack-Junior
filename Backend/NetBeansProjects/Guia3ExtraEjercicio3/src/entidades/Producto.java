/*
Los Productos
tienen como atributos: descripción, precio de lista, stock y tipo de producto; además de un método
especial calcularPrecioPublico que retornará el precio de lista más un 25% si el producto es de
tipo “Lácteo”, un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro tipo de
producto.
 */
package entidades;

/**
 *
 * @author Criss Candioti
 */
public class Producto {

    private String descripcion;
    private double precioDeLista;
    private int stock;
    private String tipoDeProducto;

    public Producto() {
    }

    public Producto(String descripcion, double precioDeLista, int stock, String tipoDeProducto) {
        this.descripcion = descripcion;
        this.precioDeLista = precioDeLista;
        this.stock = stock;
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioDeLista() {
        return precioDeLista;
    }

    public void setPrecioDeLista(double precioDeLista) {
        this.precioDeLista = precioDeLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", precioDeLista=" + precioDeLista + ", stock=" + stock + ", tipoDeProducto=" + tipoDeProducto + '}';
    }

    public double calcularPrecioPublico() {
        if ("lacteo".equals(this.tipoDeProducto)) {

            this.precioDeLista = this.precioDeLista * 1.25;
            System.out.println("El producto es lacteo se le realiza descuento del 25");

        } else if ("limpieza".equals(this.tipoDeProducto)) {

            this.precioDeLista = this.precioDeLista * 1.35;
            System.out.println("el producto es limpieza se le realiza descuento del 35");
        } else {

            this.precioDeLista = this.precioDeLista * 1.45;
            System.out.println("El producto es otros se le realiza el descuento del 45");
        }

        return this.precioDeLista;
    }
}
/*
Los Productos
tienen como atributos: descripción, precio de lista, stock y tipo de producto; además de un método
especial calcularPrecioPublico que retornará el precio de lista más un 25% si el producto es de
tipo “Lácteo”, un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro tipo de
producto.
 */
