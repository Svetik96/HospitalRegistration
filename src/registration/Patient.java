package registration;

import java.util.GregorianCalendar;

public class Patient {

  private String name;
  private GregorianCalendar birthday;
  private String diagnosis;
  private Specialization doctorSpecialization;
  
  public Patient(String name, GregorianCalendar birthday, String diagnosis, Specialization doctorSpecialization) {
    this.name = name;
    this.birthday = birthday;
    this.diagnosis = diagnosis;
    this.doctorSpecialization = doctorSpecialization;
  }
  
  public Patient() {
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setBirthday(GregorianCalendar birthday) {
    this.birthday = birthday;
  }
  
  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }
  
  public void setDoctorSpecialization(Specialization doctorSpecialization) {
    this.doctorSpecialization = doctorSpecialization;
  }
  
  public String getName() {
    return name;
  }
  
  public GregorianCalendar getBirthday() {
    return birthday;
  }
  
  public String getDiagnosis() {
    return diagnosis;
  }
  
  public Specialization getDoctorSpecialization() {
    return doctorSpecialization;
  }
  
  public String toString() {
    String patientStr = "";
    patientStr += this.getName() + ", " + this.getBirthday().get(GregorianCalendar.DAY_OF_MONTH) + 
        "." + this.getBirthday().get(GregorianCalendar.MONTH) + "." + 
        this.getBirthday().get(GregorianCalendar.YEAR) + ". Diagnosis: " + this.getDiagnosis();
    return patientStr;
  }
  
}
