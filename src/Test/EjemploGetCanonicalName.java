/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Integrante.*;
/**
 *
 * @author Enterprise
 */
public class EjemploGetCanonicalName {
    

   public static void main(String[] args) {

     Integrante integ = new Analista();
     

     // returns the canonical name of the underlying class if it exists
     System.out.println("Class = " + integ.getClass().getSimpleName()); 
   }
}

