/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package ejercicioherencia3;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Rectangulo implements CalculosFormas {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void area() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base y la altura para calcular el are del rectangulo");
        this.altura = leer.nextInt();
        this.base = leer.nextInt();
        int area = this.getBase() * this.getAltura();
        System.out.println("Su area es: " + area);
    }

    @Override
    public void perimetro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nuevamente la base y altura para calcular el perimetro del rectangulo");
        this.setAltura(leer.nextInt());
        this.setBase(leer.nextInt());
        int perimetro = (this.getBase() + this.getAltura()) * 2;
        System.out.println("Su perimetro es: " + perimetro);
    }

}
