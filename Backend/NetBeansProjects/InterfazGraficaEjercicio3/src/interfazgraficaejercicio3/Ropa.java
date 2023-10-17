/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficaejercicio3;

/**
 *
 * @author Criss Candioti
 */
public class Ropa {

    private String tela;
    private String uso;
    private int talle;

    public Ropa(String tela, String uso, int talle) {
        this.tela = tela;
        this.uso = uso;
        this.talle = talle;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Ropa{" + "tela=" + tela + ", uso=" + uso + ", talle=" + talle + '}';
    }

}
