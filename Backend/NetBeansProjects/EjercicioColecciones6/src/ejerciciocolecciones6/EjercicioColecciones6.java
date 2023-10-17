/*
6) La tienda RopaLinda SA, nos contrata para que armemos una aplicación que permita crear un
Catálogo con los distintos productos que ofrecerá a sus clientes. La tienda posee 3 tipos de tipos
de productos: Ropa, Electrodomesticos y Perfumeria. Todos los Productos tiene código,
descripción, marca, precioLista y stock; la Ropa además posee como atributo: tipoDeTela; los
Electrodomesticos poseen como atributo adicional: consumoEnW y los productos de Perfumería:
tamañoEnCC (Tamaño en centímetros cúbicos). Todos los productos tienen un método
calcularPrecioPublico, pero que cada tipo de producto implementará de la siguiente forma:
Los Electrodomésticos incrementarán un 25% el precioLista.
La Ropa incrementará un 40% el precioLista.
Los artículos de Perfumeria incrementarán un 20% por cada 100cc.

El Catalogo deberá permitir:
a) Agregar productos
b) Informar la cantidad de productos que posee de cada categoría: Ropa, Perfumería y
Electrodomésticos.
c) Listar los productos que son Electrodomesticos.
d) Listar los productos que son Ropa.
e) Listar los productos que son de Perfumería.

Luego desde el main, desde una clase Test se pide:

 Instanciar un Catálogo.
 Crear manualmente 2 productos de cada categoría.
 Agregar los productos creados al Catálogo.
 Solicitar al Catálogo la cantidad de productos por categoría.
 Solicitar al Catálogo un listado de los productos de cada categoría.
 */
package ejerciciocolecciones6;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColecciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia de productos
        Producto ropa = new Ropa("Ceda", 3312, "Remera", "LiverPool", 2000, 15);
        Producto ropa2 = new Ropa("Algodon", 4312, "Chomba", "Huapi", 3000, 15);
        Producto electrodomestico = new Electrodomesticos(1000, 3322, "Lavaropa", "Manchester", 50000, 1);
        Producto electrodomestico2 = new Electrodomesticos(1000, 4322, "Televisor", "LG", 150000, 1);
        Producto perfume = new Perfumeria(120, 3332, "Estetica", "BOSH", 5000, 10);
        Producto perfume2 = new Perfumeria(50, 4332, "Perfume Ropa", "Axe", 900, 10);
        //Instancia de la clase catalogo
        Catalogo primerCatalogo = new Catalogo();
        //Agregamos los productos a la lista
        primerCatalogo.agregarProducto(ropa);
        primerCatalogo.agregarProducto(ropa2);
        primerCatalogo.agregarProducto(electrodomestico);
        primerCatalogo.agregarProducto(electrodomestico2);
        primerCatalogo.agregarProducto(perfume);
        primerCatalogo.agregarProducto(perfume2);
        //Metodos de la clase catalogo
        primerCatalogo.cantidad();
        System.out.println("----------");
        primerCatalogo.mostrarCatalogoRopa();
        System.out.println("----------");
        primerCatalogo.mostrarCatalogoElectrodomestico();
        System.out.println("----------");
        primerCatalogo.mostrarCatalogoPerfumeria();
    }
}
