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
public class Nurse extends HealthcareProfessional {
    
    private String nurseType;
    
    public Nurse (int idNumber, String firstName, String lastName, String _nurseType){
        super(idNumber,firstName,lastName);
        nurseType = _nurseType;
    }
    
    public String getNurseType (){
        return nurseType;
    }
    
    public void setNurseType (String _nurseType){
        nurseType = _nurseType;
    }
    
    @Override
    public String toString () {
        return("NURSE INFO" + "\n" +
                "ID: " + idNumber  + "\n" +
                "FIRST NAME: " + firstName + "\n" +
                "LAST NAME: " + lastName  + "\n" +
                "NURSE TYPE: " + nurseType + "\n");
    }
    
    
}
