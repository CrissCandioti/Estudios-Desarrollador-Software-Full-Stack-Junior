/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraherencia1;

/**
 *
 * @author Criss Candioti
 */
public class BarcoVeleros extends Barco {

    private int NúmeroDeMastilesParaVeleros;

    public BarcoVeleros() {
    }

    public BarcoVeleros(int matricula, int esloraMetros, int añoFabricacion, int NúmeroDeMastilesParaVeleros) {
        super(matricula, esloraMetros, añoFabricacion);
        this.NúmeroDeMastilesParaVeleros = NúmeroDeMastilesParaVeleros;
    }

    public int getNúmeroDeMastilesParaVeleros() {
        return NúmeroDeMastilesParaVeleros;
    }

    public void setNúmeroDeMastilesParaVeleros(int NúmeroDeMastilesParaVeleros) {
        this.NúmeroDeMastilesParaVeleros = NúmeroDeMastilesParaVeleros;
    }

    @Override
    public String toString() {
        return "Barco Veleros: " + "Matricula: " + matricula + ", Metros de Eslora:" + esloraMetros + ", Año de Fabricacion: " + añoFabricacion + ", Cantidad de Mastiles: " + NúmeroDeMastilesParaVeleros;
    }

    @Override
    public int moduloBarco() {
        return super.moduloBarco() + this.getNúmeroDeMastilesParaVeleros(); //To change body of generated methods, choose Tools | Templates.
    }
}
