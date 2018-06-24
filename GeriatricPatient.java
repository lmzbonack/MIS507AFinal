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
public class GeriatricPatient extends Patient {
    
    public GeriatricPatient (int _id, String _firstName, String _lastName, int _roomNumber) {
        id = _id;
        firstName = _firstName;
        lastName = _lastName;
        roomNumber = _roomNumber;
        patientType = "Geriatric";
        //Run in the constructor to update values dynamically
    }
    
    @Override
    public void setPatientStatus(){}
    
    @Override
    public String toString(){
        return ("Patient ID: " + id + "\n" +
                "Patient First Name: " + firstName + "\n" +
                "Patient Last Name: " + lastName + "\n" +
                "Patient Room Number: " + roomNumber + "\n" +
                "Patient Type: " + patientType + "\n" +
                "Patient Status: " + patientStatus + "\n");
    }
    
}