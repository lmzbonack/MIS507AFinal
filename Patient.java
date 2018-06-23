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
public abstract class Patient {
    protected String firstName;
    protected String lastName;
    protected int roomNumber;
    protected String patientType;
    protected String patientStatus;
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    } 
    
    public int getRoomNumber(){
        return roomNumber;
    }
    
    public void setFirstName(String _firstName){
        firstName = _firstName;
    }
    
    public void setLastName(String _lastName){
        lastName = _lastName;
    } 
    
    public void setRoomNumber(int _roomNumber){
        roomNumber = _roomNumber;
    }
    
    public String getPatientType(){
        return patientType;
    } 
 
    public String getPatientStatus(){
        return patientStatus;
    }
    
    public String toString(){
        return ("Patient First Name: " + firstName + "\n" +
                "Patient Last Name: " + lastName + "\n" +
                "Patient Room Number: " + roomNumber + "\n" +
                "Patient Type: " + patientType + "\n" +
                "Patient Status: " + patientStatus);
    }
    
    public abstract void setPatientStatus();
}
