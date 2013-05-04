/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoTrabajo;
import Integrante.*;
/**
 *
 * @author Enterprise
 */
public class EquipoTrabajo {
    private Integrante integrante;
    private Integer horasDeTrabajo;
    private Boolean activo;

    public EquipoTrabajo(Integrante integrante, Integer horasDeTrabajo, Boolean activo) {
        this.integrante = integrante;
        this.horasDeTrabajo = horasDeTrabajo;
        this.activo = activo;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public Integer getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
    
    public void agregarHoras(Integer horas){
        
    }
    
    public void activar(){
        activo = true;
    }
    
    public void desactivar(){
        activo = false;
    }
    
    public String area(){
        return this.getClass().getSimpleName();
    }
    
}
