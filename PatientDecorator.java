/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienttransporttracker;

/**
 *
 * @author Luc
 */
public abstract class PatientDecorator extends Patient {
    protected Patient decoratedPatient;
    
    public PatientDecorator(Patient decoratedPatient){
        this.decoratedPatient = decoratedPatient;
    }
    
    public void setPatientStatus() {
        decoratedPatient.setPatientStatus();
    };
    
}
