/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrante;

import java.io.Serializable;

/**
 *
 * @author German Berardo|Braian|Fernando
 */
public class Integrante implements Serializable, Comparable<Integrante>{
    private String legajo; //numero de legajo
    private String nombre;
    private String apellido;
    private int antiguedad; // años de antigüedad
    //private String []rol; //asigna el rol del individuo (lenguaje, funcional o no...)

    /**
         * Constructor sin parametros 
         */

    public Integrante() {
        legajo = "0";
        nombre = "AAAA";
        apellido = "BBBB";
        antiguedad = 0;
    }
    
    /**
	 * Constructor con parametros 
	 * @param legajo
	 * @param nombre
         * @param apellido 
         * @param antiguedad 
	 */
    public Integrante(String legajo,String nombre, String apellido, int antiguedad){
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

        
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int compareTo(Integrante integrante) {
        return this.getClass().getSimpleName().compareTo(integrante.getClass().getSimpleName()) ;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
