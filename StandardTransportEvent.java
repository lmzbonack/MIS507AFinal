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
public class StandardTransportEvent extends TransportEvent {
    
    public StandardTransportEvent (int _id, Patient _patient, Transporter _assignedTransporter, HealthcareProfessional _healthcareOrderer, String _destinationLocation) {
        id =_id;
        patient = _patient;
        assignedTransporter = _assignedTransporter;
        healthcareOrderer = _healthcareOrderer;  
        destinationLocation = _destinationLocation;
        setTransportInstructions();
    }

    @Override
    public void setTransportInstructions (){
        transportInstructions = "None";
    };
    
    @Override
    public void resolveTransportEvent () {
        complete = true;
        System.out.println("Resolving event...");
    }
    
    
}