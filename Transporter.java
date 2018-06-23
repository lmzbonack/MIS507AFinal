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
public class Transporter {
    private int idNumber;
    private String firstName;
    private String lastName;
    private boolean cprCertified;
    
    Transporter(int _idNumber, String _firstName, String _lastName, boolean _cprCertified){
        idNumber = _idNumber;
        firstName = _firstName;
        lastName = _lastName;
        cprCertified = _cprCertified;   
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
    
    public boolean getCPRCert () {
        return cprCertified;
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
    
    public void setCPRCert (boolean _cprCertified) {
        cprCertified = _cprCertified;
    } 
    
    @Override
    public String toString() {
        return ("TRANSPORTER INFO" + "\n" +
                "ID: " + idNumber  + "\n" +
                "FIRST NAME: " + firstName + "\n" +
                "LAST NAME: " + lastName  + "\n" +
                "CPR CERTIFIED: " + cprCertified);
    }
}
