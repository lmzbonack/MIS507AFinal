
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patienttransporttracker;

import java.util.*;

/**
 *
 * @author Luc
 */
public class PatientTransportTracker {

    static Map<Integer, Transporter> transporterMap = new HashMap<Integer, Transporter>();
    static Map<Integer, HealthcareProfessional> hcProfMap = new HashMap<Integer, HealthcareProfessional>();
    static Map<Integer, Patient> patientMap = new HashMap<Integer, Patient>();
    static Map<Integer, TransportEvent> transportEventMap = new HashMap<Integer, TransportEvent>();
    static boolean systemActive = true;

    public static void main(String[] args) {
        System.out.println("PATIENT TRANSPORT TRACKER APPLICATION");
        System.out.println("_____________________________________");
        initializeTransporters();
        initializeHCProfs();
        listTransporters();
        listHCProfs();
        
        while (systemActive){
            Scanner scan = new Scanner(System.in);
            System.out.println("Awaiting input: ");
            String input = scan.next();
            
            //createPatient('S', 1, "Luc", "Zbonack", 100);
            if(input.equals("CREATE-PATIENT")){
                System.out.println("PATIENT TYPE: ");
                char type = scan.next().charAt(0);
                System.out.println("ID: ");
                int id = scan.nextInt();
                System.out.println("FIRST NAME: ");
                String fName = scan.next();
                System.out.println("LAST NAME: ");
                String lName = scan.next();
                System.out.println("ROOM NUMBER: ");
                int room = scan.nextInt();
                createPatient(type,id,fName,lName,room);
                if(patientMap.containsKey(id)) {
                    System.out.println("PATIENT ADDED");
                } else {
                    System.out.println("FAILED TO CREATE PATIENT");
                }
            }
            
            //decoratePatient('P', 1);
            else if(input.equals("DECORATE-PATIENT")){
                System.out.println("TYPE OF DECORATION: ");
                char type = scan.next().charAt(0);
                System.out.println("ID: ");
                int id = scan.nextInt();
                if(patientMap.containsKey(id)){
                    decoratePatient(type, id);
                    System.out.println("PATIENT DECORATED");
                } else {
                    System.out.println("INVALID KEY");
                }
            }
            
            else if(input.equals("LIST-PATIENTS")){
                listPatients();
            }
            
            //createTransportEvent('A',1,1,1,1,"Scanner1");
            //char type, int id, int patientId, int assignedTransporterId, int healthcareOrdererId, String destinationLocation
            else if(input.equals("CREATE-TRANSPORT-EVENT")){
                System.out.println("TYPE OF EVENT: ");
                char type = scan.next().charAt(0);
                System.out.println("ID: ");
                int id = scan.nextInt();
                System.out.println("PATIENT ID: ");
                int patientId = scan.nextInt();
                System.out.println("ASSIGNED TRANSPORTER ID: ");
                int transporterId = scan.nextInt();
                System.out.println("HEALTHCARE ORDERER ID: ");
                int hcOrdererId = scan.nextInt();
                System.out.println("DESTINATION LOCATION: ");
                String location = scan.next();
                if(patientMap.containsKey(patientId) && transporterMap.containsKey(transporterId) && hcProfMap.containsKey(hcOrdererId)){
                    createTransportEvent(type,id,patientId,transporterId,hcOrdererId,location);
                    System.out.println("TRANSPORT EVENT ADDED");
                } else {
                    System.out.println("INVALID KEY(S)");
                }
            }
            
            else if(input.equals("LIST-TRANSPORT-EVENTS")){
                listTransportEvents();
            }
            
            //setHealthcareAssistantTranporter(1,2);
            //int id, int healthcareId
            else if(input.equals("SET-ASSISTANT-TRANSPORTER")){
                System.out.println("TRANSPORT ID TO MODIFY: ");
                int id = scan.nextInt();
                System.out.println("HEALTHCARE ORDERER ID: ");
                int hcAssistantId = scan.nextInt();
                if(transportEventMap.containsKey(id) && hcProfMap.containsKey(hcAssistantId)){
                    setHealthcareAssistantTranporter(id,hcAssistantId);
                    System.out.println("ASSISTANT TRANSPORTER ADDED");
                } else {
                    System.out.println("INVALID KEY(S)");
                }
                
            }
            //resolveTransportEvent(1);
            else if(input.equals("RESOLVE-TRANSPORT-EVENT")){
                System.out.println("TRANSPORT ID TO MODIFY: ");
                int id = scan.nextInt(); 
                if(transportEventMap.containsKey(id)){
                    resolveTransportEvent(id);
                }
            }

            else if(input.equals("EXIT")){
                systemActive = false;
            }
                        
            else {
                System.out.println("Invalid input please retry");
            }  
        }
        
        
//            createPatient('S', 1, "Luc", "Zbonack", 100);
//            listPatients();
//            decoratePatient('P', 1);
//            listPatients();
//            createPatient('P', 2, "Timmy", "Dog", 102);
//            listPatients();
//
//            createTransportEvent('A',1,1,1,1,"Scanner1");
//            listTransportEvents();
//            resolveTransportEvent(1);
//            setHealthcareAssistantTranporter(1,2);
//            resolveTransportEvent(1);
//            listTransportEvents();
//            
//            initializeTransporters();
//            listTransporters();
//            initializeHCProfs();
//            listHCProfs();
//
//            createPatient('S', 1, "Luc", "Zbonack", 100);
//            listPatients();
//            decoratePatient('P', 1);
//            listPatients();
//            createPatient('P', 2, "Timmy", "Dog", 102);
//            listPatients();
//
//            createTransportEvent('A',1,1,1,1,"Scanner1");
//            listTransportEvents();
//            resolveTransportEvent(1);
//            setHealthcareAssistantTranporter(1,2);
//            resolveTransportEvent(1);
//            listTransportEvents();
    };

    public static void initializeTransporters() {
        System.out.println("TRANSPORTERS INITIALIZED\n");
        Transporter Sheri = new Transporter(1, "Sheriden", "Dubois", true);
        Transporter Chuck = new Transporter(2, "Chuck", "Williams", true);
        Transporter Larry = new Transporter(3, "Larry", "Dingus", false);
        transporterMap.put(Sheri.getId(), Sheri);
        transporterMap.put(Chuck.getId(), Chuck);
        transporterMap.put(Larry.getId(), Larry);
    };

    public static void listTransporters() {
        System.out.println("TRANSPORTERS\n");
        Iterator it = transporterMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue());
        }
    };
    
    public static void initializeHCProfs() {
        System.out.println("HEALTHCARE PROFESSIONALS INITIALIZED\n");
        Doctor Dingus = new Doctor(1, "Dingus", "Dodger", "Hospitalist");
        Nurse Carla = new Nurse(2, "Carla", "Cartwheel", "ICU Nurse");
        Nurse Darla = new Nurse(3, "Darla", "Dartboard", "SWAT Nurse");
        Nurse Nancy = new Nurse(4, "Nancy", "Kingman", "General Nurse");
        hcProfMap.put(Dingus.getId(), Dingus);
        hcProfMap.put(Carla.getId(), Carla);
        hcProfMap.put(Darla.getId(), Darla);
        hcProfMap.put(Nancy.getId(), Nancy);
    };

    public static void listHCProfs() {
        System.out.println("HEALTHCARE PROFESSIONALS\n");
        Iterator it = hcProfMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue());
        }
    };

    public static void createPatient(char type, int id, String fName, String lName, int room) {
        if (type == 'P') {
            Patient p = new PediatricPatient(id, fName, lName, room);
            patientMap.put(p.getId(), p);
        } else if (type == 'S') {
            Patient p = new StandardPatient(id, fName, lName, room);
            patientMap.put(p.getId(), p);
        } else if (type == 'G') {
            Patient p = new GeriatricPatient(id, fName, lName, room);
            patientMap.put(p.getId(), p);
        } else {
            System.out.println("INVALID PATIENT DATA PLEASE TRY AGAIN");
        };
    };

    public static void decoratePatient(char type, int id) {
        if (type == 'P') {
            Patient junkPatient = new PsychPatientDecorator(patientMap.get(id));
            junkPatient.setPatientStatus();
        } else if (type == 'E') {
            Patient junkPatient = new EmergencyPatientDecorator(patientMap.get(id));
            junkPatient.setPatientStatus();
        } else if (type == 'I') {
            Patient junkPatient = new ICUPatientDecorator(patientMap.get(id));
            junkPatient.setPatientStatus();
        } else if (type == 'O') {
            Patient junkPatient = new OutpatientPatientDecorator(patientMap.get(id));
            junkPatient.setPatientStatus();
        } else {
            System.out.println("INVALID PATIENT DECORATOR DATA PLEASE TRY AGAIN");
        };
    };

    public static void listPatients() {
        System.out.println("PATIENTS\n");
        Iterator it = patientMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue());
        }
    };

    public static void createTransportEvent(char type, int id, int patientId, int assignedTransporterId, int healthcareOrdererId, String destinationLocation) {
        if(type == 'A'){
            TransportEvent t = new AirborneIsolationTransportEvent(id, patientMap.get(patientId), transporterMap.get(assignedTransporterId), hcProfMap.get(healthcareOrdererId), destinationLocation);
            transportEventMap.put(t.getId(), t);
        }
        else if (type == 'C'){
            TransportEvent t = new ContactIsolationTransportEvent(id, patientMap.get(patientId), transporterMap.get(assignedTransporterId), hcProfMap.get(healthcareOrdererId), destinationLocation);
            transportEventMap.put(t.getId(), t);
        }
        else if (type == 'D'){
            TransportEvent t = new DropletIsolationTransportEvent(id, patientMap.get(patientId), transporterMap.get(assignedTransporterId), hcProfMap.get(healthcareOrdererId), destinationLocation);
            transportEventMap.put(t.getId(), t);
        }
        else {
            System.out.println("INVALID TRANSPORT EVENT DATA PLEASE TRY AGAIN");
        }
    };
    
    public static void resolveTransportEvent (int id) {
        transportEventMap.get(id).resolveTransportEvent();
    }
    
    public static void setHealthcareAssistantTranporter (int id, int healthcareId) {
        transportEventMap.get(id).setHealthcareAssistantTranporter(hcProfMap.get(healthcareId));
    }
    
    public static void listTransportEvents() {
        System.out.println("TRANSPORT EVENTS\n");
        Iterator it = transportEventMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue());
        }
    }
    
    public static void listCompletedTransportEvents() {
        System.out.println("TRANSPORT EVENTS\n");
        Iterator it = transportEventMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue());
        }
    }
        
        
    public static void listUncompletedTransportEvents() {
        System.out.println("TRANSPORT EVENTS\n");
        Iterator it = transportEventMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getValue());
        }
    }
}
