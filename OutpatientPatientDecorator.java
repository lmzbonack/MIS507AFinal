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
public class OutpatientPatientDecorator extends PatientDecorator {
    
    public OutpatientPatientDecorator(Patient decoratedPatient) {
        super(decoratedPatient);
    }
    
    @Override
    public void setPatientStatus(){
        decoratedPatient.setPatientStatus();
        setRealStatus(decoratedPatient);
    }
    
    private void setRealStatus(Patient decoratedPatient){
        decoratedPatient.patientStatus = "OUTPATIENT";
    }
}