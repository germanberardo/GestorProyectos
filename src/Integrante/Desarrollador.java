/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrante;

/**
 *
 * @author Enterprise
 */
public class Desarrollador extends Integrante{
    private String []rol = {"Senior","Semi Senior","Junior"};
    private String []lenguajes = {"C++","Java","C#","PHP","Smalltalk","Delphi","Javasript","SQL"};
    
    public Desarrollador(){
        super();
    }

    public Desarrollador(String legajo, String nombre, String apellido, int antiguedad) {
        super(legajo, nombre, apellido, antiguedad);
    }
    
}
