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
public class PatientTransportTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Patient myPatient = new PediatricPatient("Luc","Zbonack",1);
          System.out.println(myPatient.toString());
          Patient junkPatient = new PsychPatientDecorator(myPatient);
          junkPatient.setPatientStatus();
          
          System.out.println(myPatient.toString());


          
//          System.out.println("Pediatric EMERGENCY Decorated");
//          myPatient = new EmergencyPatientDecorator(myPatient);
//          System.out.println(myPatient.toString());
//          System.out.println();
//          
//          System.out.println("Standard Non-Decorated");
//          Patient myOtherPatient = new StandardPatient("Alexis","Toke",2);
//          System.out.println(myOtherPatient.toString());
//          System.out.println();
//          
//          System.out.println("Standard Psych-Decorated");
//          myOtherPatient = new PsychPatientDecorator(myOtherPatient);
//          System.out.println(myOtherPatient.toString());
//          System.out.println();
          
//          Transporter Sheri = new Transporter(1,"Sheriden","Noirot",true);
//          System.out.println(Sheri.toString());
//          System.out.println("_________");
//          
//          Doctor Dingus = new Doctor(1,"Dingus","Dodger","Hospitalist");
//          System.out.println(Dingus.toString());
//          System.out.println();
//          
//          Nurse Carla = new Nurse(1,"Carla","Cartwheel","ICU Nurse");
//          System.out.println(Carla.toString());
//          System.out.println("_________");
//          
//          TransportEvent testEventOne = new DropletIsolationTransportEvent(myPatient,Sheri,Carla,"Scanner1");
//          testEventOne.resolveTransportEvent();
//          testEventOne.setHealthcareAssistantTranporter(Carla);
//          testEventOne.resolveTransportEvent();
//          testEventOne.resolveTransportEvent();
//          System.out.println("_________");
//          
//          TransportEvent testEventTwo = new AirborneIsolationTransportEvent(myPatient,Sheri,Carla,"Scanner2");
//          testEventTwo.resolveTransportEvent();
//          testEventTwo.setHealthcareAssistantTranporter(Carla);
//          testEventTwo.resolveTransportEvent();
//          testEventTwo.resolveTransportEvent();
//          System.out.println("_________");
//          
//          TransportEvent testEventThree = new ContactIsolationTransportEvent(myPatient,Sheri,Dingus,"Scanner2");
//          testEventThree.resolveTransportEvent();
//          testEventThree.setHealthcareAssistantTranporter(Dingus);
//          testEventThree.resolveTransportEvent();
//          testEventThree.resolveTransportEvent();
  }
    
}