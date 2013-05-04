/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrante;

import java.util.Arrays;

/**
 *
 * @author Enterprise
 */
public class Analista extends Integrante{
    private String []rol = {"Funcional","No Funcional"};

    public Analista() {
    }

    public Analista(String legajo, String nombre, String apellido, int antiguedad) {
        super(legajo, nombre, apellido, antiguedad);
    }

    public String[] getRol() {
        return rol;
    }

    public void setRol(String[] rol) {
        this.rol = rol;
    }
    
    
}