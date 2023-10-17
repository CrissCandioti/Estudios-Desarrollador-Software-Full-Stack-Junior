/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionentreclasesej2;

/**
 *
 * @author Criss Candioti
 */
public class Curso {

    private char division;
    private int año;
    private Profesor profesor;

    public Curso() {
    }

    public Curso(char division, int año, Profesor profesor) {
        this.division = division;
        this.año = año;
        this.profesor = profesor;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public char getDivision() {
        return division;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setProfesor(Profesor p) {
        this.profesor = p;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + "division=" + division + ", a\u00f1o=" + año + ", profesor=" + profesor + '}';
    }

}
