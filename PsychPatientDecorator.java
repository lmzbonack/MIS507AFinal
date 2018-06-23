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
public class PsychPatientDecorator extends PatientDecorator {
    
    public PsychPatientDecorator(Patient decoratedPatient) {
        super(decoratedPatient);
    }
    
    @Override
    public void setPatientStatus(){
        System.out.println("RUN");
        decoratedPatient.setPatientStatus();
        setRealStatus(decoratedPatient);
    }
    
    private void setRealStatus(Patient decoratedPatient){
        decoratedPatient.patientStatus = "PSYCH PATIENT";
    }
}
