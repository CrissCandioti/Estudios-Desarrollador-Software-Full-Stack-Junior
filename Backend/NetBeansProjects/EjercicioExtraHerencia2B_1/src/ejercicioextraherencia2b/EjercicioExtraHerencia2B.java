/*
2. Se desean gestionar viajes terrestres en vehículos propios, con el objetivo de poder calcular el
costo de los mismos. Un viaje tiene la siguiente información: lugar de origen, lugar de destino,
distancia entre las ciudades (se conoce este dato si las ciudades no están sobre la misma ruta), tipo
de combustible del vehículo, vehículo, cantidad de peajes y si las ciudades se encuentran sobre la
misma ruta Km en el cual se encuentra cada ciudad. Un ejemplo de viaje sobre una misma ruta es
ir de San Luis a Rufino en la provincia de Santa Fe.
Del combustible necesitamos conocer: el tipo de combustible y precio.
Existen diferentes tipos de vehículos: Autos, Camiones y Camionetas; todos tienen la siguiente
información: marca, patente y combustible; además del comportamiento
calcularCostoDeCombustible() que cada tipo de vehículo lo implementará de la siguiente forma:
el consumo de combustible es de 7 Lts cada 100 Km para los autos, 10 Lts cada 100 Km para las
camionetas y 12 Lts cada 100 Km para los camiones.

Se posee además la siguiente información: el costo del viaje depende de la distancia, el consumo de
combustible y la cantidad de peajes. El costo de los peajes también depende del tipo de vehículo
(vamos a suponer que todos los peajes tienen el mismo costo), los autos y camionetas están en una
categoría y los camiones en otra. Si las ciudades están sobre la misma ruta se recibe el Km de la
ciudad origen y el Km de la ciudad destino. De lo contrario se recibe la distancia.
La clase viaje poseerá al menos 2 constructores, y los siguientes métodos:
• Cálculo de distancia
• Cálculo del costo en peajes,
• Calculo del costo en combustibles
• Cálculo del costo total.
 */
package ejercicioextraherencia2b;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExtraHerencia2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculos auto = new Auto("Renault", "3312", new Combustible("Gasoil", 150));
        Vehiculos camioneta = new Camioneta("Ford", "3313", new Combustible("Diesel", 400));
        Vehiculos camion = new Camion("Scania", "3314", new Combustible("Nafta", 350));

        Viaje viaje = new Viaje("Santa Fe", "Buenos Aires", 400, 15, camioneta);
        System.out.println("Costo peaje");
        System.out.println(viaje.costopeaje());
        System.out.println("Costo combustible");
        System.out.println(viaje.costoCombustible());
        System.out.println("Costo total del viaje");
        System.out.println(viaje.total());
    }

}
