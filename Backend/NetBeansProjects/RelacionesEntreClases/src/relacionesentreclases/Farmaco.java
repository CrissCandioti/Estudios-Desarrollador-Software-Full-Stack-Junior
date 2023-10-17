/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

/**
 *
 * @author Criss Candioti
 */
class Farmaco {

    private String agente;

    public Farmaco(String agente) {
        this.agente = agente;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    @Override
    public String toString() {
        return "Farmaco{" + "agente=" + agente + '}';
    }

}
