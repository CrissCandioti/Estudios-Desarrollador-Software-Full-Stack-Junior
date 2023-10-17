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
public class Circulo implements CalculosFormas {

    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void area() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio para calcular su area");
        this.setRadio(leer.nextDouble());
        double area = PI * Math.pow(this.getRadio(), 2);
        System.out.println("El area del Circulo es: " + area);
    }

    @Override
    public void perimetro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su diametro para calcular su perimetro");
        this.setDiametro(leer.nextDouble());
        double perimetro = PI * this.getDiametro();
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

}
/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
