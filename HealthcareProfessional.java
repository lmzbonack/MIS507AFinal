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
public abstract class HealthcareProfessional {
    protected int idNumber;
    protected String firstName;
    protected String lastName;
    
    HealthcareProfessional(int _idNumber, String _firstName, String _lastName){
        idNumber = _idNumber;
        firstName = _firstName;
        lastName = _lastName;
    }
    
    public int getId () {
        return idNumber;
    }
    
    public String getFirstName () {
        return firstName;
    }
    
    public String getLastName () {
        return lastName;
    }
    
    public void setId (int _idNumber) {
        idNumber = _idNumber;
    }
    
    public void setFirstName (String _firstName) {
        firstName = _firstName;
    }
    
    public void setLastName (String _lastName) {
        lastName = _lastName;
    }
}
