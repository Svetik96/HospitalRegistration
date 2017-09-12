package registration;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    ArrayList<Doctor> listOfDoctors = new ArrayList<Doctor>();
    ArrayList<Patient> listOfPatients = new ArrayList<Patient>();
    
    listOfDoctors.add(new Doctor("Roman Petrenko", Specialization.CARDIOLOGY));
    listOfDoctors.add(new Doctor("Volodymyr Novak", Specialization.NEUROLOGY));
    listOfDoctors.add(new Doctor("Sergiy Yakymiv", Specialization.OPHTALMOLOGY));
    listOfDoctors.add(new Doctor("Andriy Kernikevych", Specialization.THERAPY));
    
    listOfPatients.add(new Patient("Bogdan Bodnaruk", new GregorianCalendar(1979, 5, 15), "Some diagnosis 1", Specialization.NEUROLOGY));
    listOfPatients.add(new Patient("Ivan Andrusiv", new GregorianCalendar(1979, 5, 15), "Some diagnosis 2", Specialization.OPHTALMOLOGY));
    listOfPatients.add(new Patient("Anna Ivanyuk", new GregorianCalendar(1979, 5, 15), "Some diagnosis 3", Specialization.THERAPY));
    
    boolean flag = true;
    
    while (flag) {
      System.out.println("********Menu********");
      System.out.println("1. Add patient");
      System.out.println("2. Show all patients");
      System.out.println("3. Show doctors");
      System.out.println("4. Show doctors and patients");
      System.out.println("5. Delete patient");
      System.out.println("0. Exit");
      
      Scanner in = new Scanner(System.in);
      int choice = in.nextInt();
      
      switch (choice) {
      case 1: 
        listOfPatients.add(Actions.addPatient());
        break;
      case 2:
        System.out.println(listOfPatients.toString());
        break;
      case 3:
        System.out.println(listOfDoctors);
        break;
      case 4:
        Actions.doctorsAndPatients(listOfDoctors, listOfPatients);
        break;
      case 5:
        if(Actions.removePatient(listOfPatients)) {
          System.out.println("Patient removed from the list");
        } else {
          System.out.println("There is no this patient in the list");
        }
        break;
      case 0: 
        flag = false;
        break;
      default: break;
      }
    }
  }

}
