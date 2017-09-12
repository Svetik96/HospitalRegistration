package registration;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actions {

  public static Patient addPatient() {
    Patient patient = new Patient();
    Scanner in = new Scanner(System.in);
    
    System.out.println("Name: ");
    patient.setName(in.nextLine());
    
    System.out.println("Diagnosis: ");
    patient.setDiagnosis(in.nextLine());
    
    System.out.println("Birthday (year, month, day): ");
    try {
      patient.setBirthday(new GregorianCalendar(in.nextInt(), in.nextInt(), in.nextInt()));
    } catch (InputMismatchException e) {
      System.out.println("Invalid date");
    }

    System.out.println("Doctor: (1 - THERAPY, 2 - OPHTALMOLOGY, 3 - NEUROLOGY, 4 - CARDIOLOGY)");
    
    while (patient.getDoctorSpecialization() == null) {
      int choice = in.nextInt();
      switch (choice) {
      case 1:
        patient.setDoctorSpecialization(Specialization.THERAPY);
        break;
      case 2:
        patient.setDoctorSpecialization(Specialization.OPHTALMOLOGY);
        break;
      case 3:
        patient.setDoctorSpecialization(Specialization.NEUROLOGY);
        break;
      case 4:
        patient.setDoctorSpecialization(Specialization.CARDIOLOGY);
        break;
      default:
        System.out.println("Invalid doctor");
        break;
      }
    }
    
    System.out.println(patient.toString());
    return patient;
  }
  
  public static void doctorsAndPatients(ArrayList<Doctor> listOfDoctors, ArrayList<Patient> listOfPatients) {
    for(Doctor doctor : listOfDoctors) {
      System.out.println("Doctor\n  " + doctor);
      System.out.println("Patients");
      for(Patient patient : listOfPatients) {
        if(doctor.getSpecialization().equals(patient.getDoctorSpecialization())) {
          
          System.out.print("  " + patient + "\n");
        }
      }
      System.out.println("-----------------------------");
    }
  }
  
  public static boolean removePatient(ArrayList<Patient> listOfPatients) {
    System.out.println("Input patient`s name: ");
    Scanner in = new Scanner(System.in);
    String nameForRemuving = in.nextLine();
    boolean b = false;
    for (Patient patient : listOfPatients) {
      if (patient.getName().equals(nameForRemuving)) {
        listOfPatients.remove(patient);
        b = true;
        break;
      }
    }
    
    return b;
  }
  
}
