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
public class Doctor extends HealthcareProfessional {
    
    private String doctorType;
    
    public Doctor (int idNumber, String firstName, String lastName, String _doctorType){
        super(idNumber,firstName,lastName);
        doctorType = _doctorType;
    }
    
    public String getDoctorType (){
        return doctorType;
    }
    
    public void setDoctorType (String _doctorType){
        doctorType = _doctorType;
    }
    
    @Override
    public String toString () {
        return("DOCTOR INFO" + "\n" +
                "ID: " + idNumber  + "\n" +
                "FIRST NAME: " + firstName + "\n" +
                "LAST NAME: " + lastName  + "\n" +
                "DOCTOR TYPE: " + doctorType + "\n");
    }
}
