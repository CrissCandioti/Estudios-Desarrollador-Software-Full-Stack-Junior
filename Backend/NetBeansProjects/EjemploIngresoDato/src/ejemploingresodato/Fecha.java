/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploingresodato;

/**
 *
 * @author Criss Candioti
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int calcularAños(Fecha x) {
        int diferencia = 0;
        if (x.getMes() == this.mes) {
            if (x.getDia() <= this.dia) {
                diferencia = x.getAño() - this.año;
            } else {
                diferencia = x.getAño() - (this.año - 1);
            }
        } else if (x.getMes() > this.mes) {
            diferencia = x.getAño() - (this.año - 1);
        } else {
            diferencia = x.getAño() - this.año;
        }
        if (diferencia < 0) {
            return (diferencia * -1);
        } else {
            return diferencia;
        }
    }
}
