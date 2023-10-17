package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Producto numero1 = new Producto();
        Producto numero2 = new Producto(20, "Queso", 7000, 10);

        numero1.setCodigo(24);
        numero1.setDescripcion("Shampoo");
        numero1.setPrecio(1000);
        numero1.setStock(1);

        System.out.println(numero1);
        System.out.println(numero2);
    }

}
