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
public class BarcoYate extends Barco {

    private int PotenciaCV;
    private int numeroCamarotes;

    public BarcoYate() {
    }

    public BarcoYate(int PotenciaCV, int numeroCamarotes, int matricula, int esloraMetros, int añoFabricacion) {
        super(matricula, esloraMetros, añoFabricacion);
        this.PotenciaCV = PotenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCV() {
        return PotenciaCV;
    }

    public void setPotenciaCV(int PotenciaCV) {
        this.PotenciaCV = PotenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "Barco Yate: " + "Matricula: " + matricula + ", Metros de Eslora:" + esloraMetros + ", Año de Fabricacion: " + añoFabricacion + ", Potencia CV: " + PotenciaCV + ", Numero de Camarotes: " + numeroCamarotes;
    }

    @Override
    public int moduloBarco() {
        return super.moduloBarco() + (this.getPotenciaCV() + this.getNumeroCamarotes()); //To change body of generated methods, choose Tools | Templates.
    }
}
