/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraherencia2b;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Viaje {

    private String lugarOrigen;
    private int kmLugarOrigen;
    private String lugarDestino;
    private int kmLugarDestino;
    private int distanciaCuidades;
    private int cantidadPeaje;
    private boolean mismaRuta = false;
    private Auto auto1;
    private Camioneta camioneta1;
    private Camion camion1;
    private double costoTotalPeaje;
    private double costoTotalCombustible;
    private String respuestaMovilidad;

    public Viaje() {
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public int getKmLugarOrigen() {
        return kmLugarOrigen;
    }

    public void setKmLugarOrigen(int kmLugarOrigen) {
        this.kmLugarOrigen = kmLugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public int getKmLugarDestino() {
        return kmLugarDestino;
    }

    public void setKmLugarDestino(int kmLugarDestino) {
        this.kmLugarDestino = kmLugarDestino;
    }

    public int getDistanciaCuidades() {
        return distanciaCuidades;
    }

    public void setDistanciaCuidades(int distanciaCuidades) {
        this.distanciaCuidades = distanciaCuidades;
    }

    public int getCantidadPeaje() {
        return cantidadPeaje;
    }

    public void setCantidadPeaje(int cantidadPeaje) {
        this.cantidadPeaje = cantidadPeaje;
    }

    public boolean isMismaRuta() {
        return mismaRuta;
    }

    public void setMismaRuta(boolean mismaRuta) {
        this.mismaRuta = mismaRuta;
    }

    public Auto getAuto1() {
        return auto1;
    }

    public void setAuto1(Auto auto1) {
        this.auto1 = auto1;
    }

    public Camioneta getCamioneta1() {
        return camioneta1;
    }

    public void setCamioneta1(Camioneta camioneta1) {
        this.camioneta1 = camioneta1;
    }

    public Camion getCamion1() {
        return camion1;
    }

    public void setCamion1(Camion camion1) {
        this.camion1 = camion1;
    }

    public double getCostoTotalPeaje() {
        return costoTotalPeaje;
    }

    public void setCostoTotalPeaje(double costoTotalPeaje) {
        this.costoTotalPeaje = costoTotalPeaje;
    }

    public double getCostoTotalCombustible() {
        return costoTotalCombustible;
    }

    public void setCostoTotalCombustible(double costoTotalCombustible) {
        this.costoTotalCombustible = costoTotalCombustible;
    }

    public String getRespuestaMovilidad() {
        return respuestaMovilidad;
    }

    public void setRespuestaMovilidad(String respuestaMovilidad) {
        this.respuestaMovilidad = respuestaMovilidad;
    }

    public void calculoDistancia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Las ciudades estan en una misma ruta?");
        String respuesta = leer.nextLine();
        if ("si".equals(respuesta)) {
            this.mismaRuta = true;
            System.out.println("Ingrese el lugar de origen y el KM");
            this.setLugarOrigen(leer.nextLine());
            this.setKmLugarOrigen(leer.nextInt());
            System.out.println("Ahora ingrese el lugar de destino y el KM");
            this.setLugarDestino(leer.nextLine());
            leer.nextLine();
            this.setKmLugarDestino(leer.nextInt());
        } else {
            System.out.println("Ingrese el lugar de origen y lugar de destino");
            this.setLugarOrigen(leer.nextLine());
            this.setLugarDestino(leer.nextLine());
            System.out.println("Ahora ingrese los km de distancia");
            this.setDistanciaCuidades(leer.nextInt());
        }
    }

    public void movilidad() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es su medio de movilidad?");
        String medio = leer.nextLine();
        this.setRespuestaMovilidad(medio);
        switch (medio) {
            case "auto":
                Auto a = new Auto();
                Combustible c = new Combustible();
                System.out.println("Por favor registre los datos de su auto para continuar");
                System.out.println("Ingrese la marca");
                a.setMarca(leer.nextLine());
                System.out.println("Ingrese la patente");
                a.setPatente(leer.nextLine());
                System.out.println("Por ultimo registre el combustible con el cual funciona");
                c.setTipoCombustible(leer.nextLine());
                System.out.println("Precio del combustible de su auto");
                c.setPrecio(leer.nextInt());
                this.auto1 = a;
                this.auto1.setCombustibles(c);
                System.out.println(this.auto1);
                break;
            case "camioneta":
                Camioneta ca = new Camioneta();
                Combustible ca1 = new Combustible();
                System.out.println("Por favor registre los datos de su camioneta para continuar");
                System.out.println("Ingrese la marca");
                ca.setMarca(leer.nextLine());
                System.out.println("Ingrese la patente");
                ca.setPatente(leer.nextLine());
                System.out.println("Por ultimo registre el combustible con el cual funciona");
                ca1.setTipoCombustible(leer.nextLine());
                System.out.println("Precio del combustible de su camioneta");
                ca1.setPrecio(leer.nextInt());
                this.camioneta1 = ca;
                this.camioneta1.setCombustibles(ca1);
                System.out.println(this.camioneta1);
                break;
            case "camion":
                Camion cam = new Camion();
                Combustible cam1 = new Combustible();
                System.out.println("Por favor registre los datos de su camion para continuar");
                System.out.println("Ingrese la marca");
                cam.setMarca(leer.nextLine());
                System.out.println("Ingrese la patente");
                cam.setPatente(leer.nextLine());
                System.out.println("Por ultimo registre el combustible con el cual funciona");
                cam1.setTipoCombustible(leer.nextLine());
                System.out.println("Precio del combustible de su auto");
                cam1.setPrecio(leer.nextInt());
                this.camion1 = cam;
                this.camion1.setCombustibles(cam1);
                System.out.println(this.camion1);
        }
    }

    public void costoPeaje() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de peajes");
        this.setCantidadPeaje(leer.nextInt());

        if ("auto".equals(this.getRespuestaMovilidad()) || "camioneta".equals(this.getRespuestaMovilidad())) {
            int costoDelPeaje = this.getCantidadPeaje() * 150;
            System.out.println("Al tener un auto o camioneta, estas son de la misma categoria, los peajes tiene un costo de 150");
            System.out.println("El total a pagar en peajes es: " + costoDelPeaje);
            this.setCostoTotalPeaje(costoDelPeaje);

        } else {
            int costoDelPeaje = this.getCantidadPeaje() * 300;
            System.out.println("Al tener que viajar en camion el costo del peaje es aun mayor, es de 300");
            System.out.println("El costo total del peaje es: " + costoDelPeaje);
            this.setCostoTotalPeaje(costoDelPeaje);

        }
    }

    public void costoCombustible() {
        if (mismaRuta == true) {
            if ("auto".equals(this.getRespuestaMovilidad())) {
                double costosCombustible = (this.auto1.calcularCostoDeCombustible() * (this.getKmLugarDestino() - this.getKmLugarOrigen())) / 100;
                double total = costosCombustible * this.auto1.getCombustibles().getPrecio();
                System.out.println("Costo total de combustible por viajar en auto: " + total);
                this.setCostoTotalCombustible(total);
            } else if ("camioneta".equals(this.getRespuestaMovilidad())) {
                double costosCombustible = (this.camioneta1.calcularCostoDeCombustible() * (this.getKmLugarDestino() - this.getKmLugarOrigen())) / 100;
                double total = costosCombustible * this.camioneta1.getCombustibles().getPrecio();
                System.out.println("Costo total de combustible por viajar en camioneta: " + total);
                this.setCostoTotalCombustible(total);
            } else if ("camion".equals(this.getRespuestaMovilidad())) {
                double costosCombustible = (this.camion1.calcularCostoDeCombustible() * (this.getKmLugarDestino() - this.getKmLugarOrigen())) / 100;
                double total = costosCombustible * this.camion1.getCombustibles().getPrecio();
                System.out.println("Costo total de combustible por viajar en camion: " + total);
                this.setCostoTotalCombustible(total);
            }
        } else if (mismaRuta == false) {
            if ("auto".equals(this.getRespuestaMovilidad())) {
                double costosCombustible = (this.auto1.calcularCostoDeCombustible() * this.getDistanciaCuidades()) / 100;
                double total = costosCombustible * this.auto1.getCombustibles().getPrecio();
                System.out.println("Costo total de combustible por viajar en auto: " + total);
                this.setCostoTotalCombustible(total);
            } else if ("camioneta".equals(this.getRespuestaMovilidad())) {
                double costosCombustible = (this.camioneta1.calcularCostoDeCombustible() * this.getDistanciaCuidades()) / 100;
                double total = costosCombustible * this.camioneta1.getCombustibles().getPrecio();
                System.out.println("Costo total de combustible por viajar en camioneta: " + total);
                this.setCostoTotalCombustible(total);
            } else if ("camion".equals(this.getRespuestaMovilidad())) {
                double costosCombustible = (this.camion1.calcularCostoDeCombustible() * this.getDistanciaCuidades()) / 100;
                double total = costosCombustible * this.camion1.getCombustibles().getPrecio();
                System.out.println("Costo total de combustible por viajar en camion: " + total);
                this.setCostoTotalCombustible(total);
            }
        }
    }

    public void costoTotal() {
        if (mismaRuta == true) {
            if ("auto".equals(this.getRespuestaMovilidad())) {
                double total = this.getCostoTotalPeaje() + this.getCostoTotalCombustible();
                System.out.println("El costo total del viaje es: " + total);
            } else if ("camioneta".equals(this.getRespuestaMovilidad())) {
                double total = this.getCostoTotalPeaje() + this.getCostoTotalCombustible();
                System.out.println("El costo total del viaje es: " + total);
            } else if ("camion".equals(this.getRespuestaMovilidad())) {
                double total = this.getCostoTotalPeaje() + this.getCostoTotalCombustible();
                System.out.println("El costo total del viaje es: " + total);
            }
        } else if (mismaRuta == false) {
            if ("auto".equals(this.getRespuestaMovilidad())) {
                double total = this.getCostoTotalPeaje() + this.getCostoTotalCombustible();
                System.out.println("El costo total del viaje es: " + total);
            } else if ("camioneta".equals(this.getRespuestaMovilidad())) {
                double total = this.getCostoTotalPeaje() + this.getCostoTotalCombustible();
                System.out.println("El costo total del viaje es: " + total);
            } else if ("camion".equals(this.getRespuestaMovilidad())) {
                double total = this.getCostoTotalPeaje() + this.getCostoTotalCombustible();
                System.out.println("El costo total del viaje es: " + total);
            }
        }
    }
}
