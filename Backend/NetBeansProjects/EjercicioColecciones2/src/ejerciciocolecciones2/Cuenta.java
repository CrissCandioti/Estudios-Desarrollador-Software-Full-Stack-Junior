/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones2;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Criss Candioti
 */
public class Cuenta {

    private long numero;
    private double saldo;
    private double interesAnual;
    private Cliente titular;
    private LinkedList<Movimiento> movimientos = new LinkedList<>();

    public Cuenta(long numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public LinkedList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(LinkedList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
        Movimiento deposito = new Movimiento(LocalDate.now(), 'D', cantidad, saldo);
        this.movimientos.add(deposito);

    }

    public void extraer(int cantidad) {
        for (Movimiento aux : movimientos) {
            if (aux.getSaldo() > cantidad) {
                System.out.println("Perfecto extraeremos el dinero");
                this.saldo -= cantidad;
            } else {
                System.out.println("No tiene suficiente saldo en su cuenta para extraer el dinero");
            }
        }
        Movimiento extraccion = new Movimiento(LocalDate.now(), 'E', cantidad, this.saldo);
        this.movimientos.add(extraccion);

    }

    public void interesAnual(int valor) {
        int interes = valor * 12;
        this.saldo += interes;
        Movimiento intere = new Movimiento(LocalDate.of(2024, Month.JUNE, 15), 'I', interes, saldo);
        this.movimientos.add(intere);

    }

    public Cliente verTitular() {
        return this.titular;
    }

    public double verSaldo() {
        return this.saldo;
    }

    public void listarMovimientos() {
        ListIterator<Movimiento> it = movimientos.listIterator();
        while (it.hasNext()) {
            Movimiento aux = it.next();
            System.out.println(aux);
        }
    }
}
