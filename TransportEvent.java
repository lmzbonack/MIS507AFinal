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

abstract public class TransportEvent {
    protected int id;
    protected Patient patient;
    protected Transporter assignedTransporter;
    protected HealthcareProfessional healthcareOrderer;
    protected String destinationLocation;
    protected boolean complete=false;
    
    protected HealthcareProfessional healthcareAssistantTranporter;
    protected String transportInstructions;
   
    public int getId () {
        return id;
    }
    
    public Patient getPatient () {
        return patient;
    }
    
    public Transporter getAssignedTransporter () {
        return assignedTransporter;
    }
    
    public HealthcareProfessional getOrderer () {
        return healthcareOrderer;
    }
    
    public String getDestinationLocation () {
        return destinationLocation;
    }
    
    public boolean getCompletionStatus() {
        return complete;
    }
    
    public HealthcareProfessional getHealthcareAssistantTranporter (){
        return healthcareAssistantTranporter;

    };
    
    public String getTransportInstructions () {
        return transportInstructions;
    };
    
    public void setId(int _id){
        id = _id;
    }
    
    public void setCompletionStatus(boolean _complete) {
        complete = _complete;
    }
    
    public void setPatient (Patient _patient) {
        patient = _patient;
    }
    
    public void setAssignedTransporter (Transporter _assignedTransporter) {
        assignedTransporter = _assignedTransporter;
    }
    
    public void setOrderer(HealthcareProfessional _healthcareOrderer) {
        healthcareOrderer = _healthcareOrderer;
    }
    
    public void setDestinationLocation (String _destinationLocation) {
        destinationLocation = _destinationLocation;
    }
    
    abstract public void setHealthcareAssistantTranporter (HealthcareProfessional _healthcareAssistantTranporter);
    
    abstract public void setTransportInstructions ();
    
//    Implement this as part of strat pattern only allowed to resolve is cetain params met
    abstract public void resolveTransportEvent ();

    public String toString () {
        return("TRANSPORT EVENT INFO" + "\n" + 
               "COMPLETE?: " + complete + "\n" +
               "ORDERED BY: " + healthcareOrderer.getFirstName() + " " + healthcareOrderer.getLastName() + "\n" +
               "FOR PATIENT: " + patient.getFirstName() + " " + patient.getLastName() + "\n" +
               "FROM: Room " + patient.getRoomNumber() + "\n" +
               "TO: " + destinationLocation + "\n" +
               "ASSIGNED TRANSPORTER: " + assignedTransporter.getId() + "\n" +
               "ASSIGNED HEALTHCARE ASSISTANT TRANSPORTER: " + healthcareAssistantTranporter.getFirstName() + " " + healthcareAssistantTranporter.getLastName()+ "\n" +
               "TRANSPORT INSTRUCTION: " + transportInstructions + "\n"
               );
    }
}
