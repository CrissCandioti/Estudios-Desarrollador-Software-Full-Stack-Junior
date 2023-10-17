/*
la clase Venta que posee como atributos: un Cliente, el
Vendedor y 3 Productos, además de un método calcularTotal que sumará los precios públicos de
los productos y hará un descuento de acuerdo a la ciudad en donde vive el Cliente: si es de San
Luis, posee un descuento del 10% y si es de otra provincia un 15% de descuento.
 */
package Negocio;

import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;

/**
 *
 * @author Criss Candioti
 */
public class Venta {

    private Cliente cliente1;
    private Vendedor vendedor1;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;

    public Venta() {
    }

    public Venta(Cliente cliente1, Vendedor vendedor1, Producto producto1, Producto producto2, Producto producto3) {
        this.cliente1 = cliente1;
        this.vendedor1 = vendedor1;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Vendedor getVendedor1() {
        return vendedor1;
    }

    public void setVendedor1(Vendedor vendedor1) {
        this.vendedor1 = vendedor1;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente1=" + cliente1 + ", vendedor1=" + vendedor1 + ", producto1=" + producto1 + ", producto2=" + producto2 + ", producto3=" + producto3 + '}';
    }

    public void calcularTotal() {
        if ("san luis".equals(this.cliente1.getCiudad())) {
            double costoTotal = this.producto1.getPrecioDeLista() + this.producto2.getPrecioDeLista() + this.producto3.getPrecioDeLista();
            double descuentoSanLuis = (costoTotal * 10) / 100;
            costoTotal -= descuentoSanLuis;
            System.out.println("El cliente al ser residente de Lan Luis le aremos un pequeño descuento del 10%");
            System.out.println("El total a pagar es: " + costoTotal + " , el descuento que se le realizo es de :" + descuentoSanLuis);
        } else {
            double costoTotal = this.producto1.getPrecioDeLista() + this.producto2.getPrecioDeLista() + this.producto3.getPrecioDeLista();
            double descuentoOtros = (costoTotal * 15) / 100;
            costoTotal -= descuentoOtros;
            System.out.println("El cliente al ser residente de otra provincia le aremos un pequeño descuento del 15%");
            System.out.println("El total a pagar es: " + costoTotal + " , el descuento que se le realizo es de :" + descuentoOtros);
        }
    }
}
/*
la clase Venta que posee como atributos: un Cliente, el
Vendedor y 3 Productos, además de un método calcularTotal que sumará los precios públicos de
los productos y hará un descuento de acuerdo a la ciudad en donde vive el Cliente: si es de San
Luis, posee un descuento del 10% y si es de otra provincia un 15% de descuento.
 */
