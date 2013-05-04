/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrante;

/**
 *
 * @author Enterprise
 */
public class Tester extends Integrante{
    private String []rol = {"Senior","Junior"};

    public Tester() {
    }

    public Tester(String legajo, String nombre, String apellido, int antiguedad) {
        super(legajo, nombre, apellido, antiguedad);
    }

    public String[] getRol() {
        return rol;
    }

    public void setRol(String[] rol) {
        this.rol = rol;
    }
    
    
}
