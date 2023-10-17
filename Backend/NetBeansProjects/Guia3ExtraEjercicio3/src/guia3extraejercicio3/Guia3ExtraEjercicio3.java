/*
En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
Definir un paquete de nombre “entidades” con las clases: Cliente, Producto y Vendedor. En otro
paquete de nombre “Negocio” tendremos la clase Venta que posee como atributos: un Cliente, el
Vendedor y 3 Productos, además de un método calcularTotal que sumará los precios públicos de
los productos y hará un descuento de acuerdo a la ciudad en donde vive el Cliente: si es de San
Luis, posee un descuento del 10% y si es de otra provincia un 15% de descuento. Los Productos
tienen como atributos: descripción, precio de lista, stock y tipo de producto; además de un método
especial calcularPrecioPublico que retornará el precio de lista más un 25% si el producto es de
tipo “Lácteo”, un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro tipo de
producto.

Desde el método main de una clase TestComercio se pide:
a) Crear 3 Productos.
b) Crear un Cliente y un Vendedor.
c) Crear una Venta del Vendedor creado en el punto b para el Cliente creado en el punto b y
con los 3 productos del punto a.
d) Solicitar a la Venta que informe el total.
 */
package guia3extraejercicio3;

import Negocio.Venta;
import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;

/**
 *
 * @author Criss Candioti
 */
public class Guia3ExtraEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 = new Producto("Queso Cremoso", 1450, 10, "lacteo");
        Producto p2 = new Producto("Lavandina", 1000, 25, "limpieza");
        Producto p3 = new Producto("Marucha", 1250, 5, "carnes");

        Cliente c1 = new Cliente("Carlitox", "Frey", 29, 26987456, "san luis");
        Cliente c2 = new Cliente("Eli", "vallejos", 35, 27159357, "santa fe");

        Vendedor v1 = new Vendedor("El viejo", "chaleco", "ATR empresas");

//        p1.calcularPrecioPublico(); Verificamos si el producto realiza de manera correcta el descuento por ser lacteo, limpieza u otros producto.
//        p2.calcularPrecioPublico();
//        p3.calcularPrecioPublico();

        Venta ventaDelDia = new Venta(c1, v1, p1, p2, p3); //El cliente al ser recidente de san luis se le aplica el descuento del 10.
        System.out.println(ventaDelDia);
        ventaDelDia.calcularTotal();

        Venta segundaDelDia = new Venta(c2, v1, p1, p2, p3); //El cliente al ser recidente de otra provincia se le aplica el descuento del 15.
        System.out.println(segundaDelDia);
        segundaDelDia.calcularTotal();
    }

}
