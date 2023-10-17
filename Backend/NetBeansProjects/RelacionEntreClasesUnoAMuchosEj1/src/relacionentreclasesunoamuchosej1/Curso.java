/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionentreclasesunoamuchosej1;

import java.util.List;

/**
 *
 * @author Criss Candioti
 */
public class Curso {

    private int año;
    private char curso;
    private List<Alumno> alumnos;

    public Curso() {
    }

    public Curso(int año, char curso, List<Alumno> alumnos) {
        this.año = año;
        this.curso = curso;
        this.alumnos = alumnos;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setCurso(char curso) {
        this.curso = curso;
    }

    public char getCurso() {
        return curso;
    }

    public void setAlumno(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "a\u00f1o=" + año + ", curso=" + curso + ", alumnos=" + alumnos + '}';
    }
    
}
