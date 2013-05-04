/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorsoft;

import Estimable.Estimable;
import Integrante.*;
import EquipoTrabajo.*;
import Requerimiento.Requerimiento;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Fernando, Braian, German
 */
public class Proyecto implements Estimable{

    public class Proyecto implements Estimable{
    private String nombre;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;
    private List<EquipoTrabajo> LLEquipoTrabajo;
    private List<Requerimiento> LLRequerimientos;
    
    
   public Proyecto(){
    fechaInicio = new GregorianCalendar();    
    fechaFin = new GregorianCalendar();
    LLEquipoTrabajo = new LinkedList<EquipoTrabajo>();
    LLRequerimientos = new LinkedList<Requerimiento>();
    
   }
   
   public Proyecto(String nombre,GregorianCalendar fechaInicio, GregorianCalendar fechaFin,List<EquipoTrabajo> LLEquipoTrabajo, List<Requerimiento> LLRequerimientos ) {
       this.nombre = nombre;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.LLEquipoTrabajo = LLEquipoTrabajo;
       this.LLRequerimientos = LLRequerimientos;
   }
   
   public int duracionEstimada(){
       
   }
   
   
}
