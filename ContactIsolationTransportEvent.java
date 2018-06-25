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
public class ContactIsolationTransportEvent extends TransportEvent {
    
    public ContactIsolationTransportEvent (int _id, Patient _patient, Transporter _assignedTransporter, HealthcareProfessional _healthcareOrderer, String _destinationLocation) {
        id =_id;
        patient = _patient;
        assignedTransporter = _assignedTransporter;
        healthcareOrderer = _healthcareOrderer;  
        destinationLocation = _destinationLocation;
        setTransportInstructions();
    }

    @Override
    public void setTransportInstructions (){
        transportInstructions = "THIS IS A CONTACT ISOLATION TRANSPORT";
    };
    
    @Override
    public void resolveTransportEvent () {
        //If Assistant Transporter with Doctor type
        if(healthcareAssistantTranporter != null) {
            if (healthcareAssistantTranporter.getClass() == Doctor.class) {
                if(complete != true) {
                    complete = true;
                    System.out.println("Resolving event...");
                }
                else {
                    System.out.println("Event is already resolved...");
                }
            } 
        }
        else {
            System.out.println("Cannot resolve event no healthcareAssistantTranporter or invalid healthcareAssistantTranporter has been assigned (Doctor must be assigned to Contact Isolation Transport)");
        }
    }
    
    
}
