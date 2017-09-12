package registration;

public class Doctor {

  private String name;
  private Specialization specialization;
  
  public Doctor(String name, Specialization specialization) {
    this.name = name;
    this.specialization = specialization;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setSpecialization(Specialization specialization) {
    this.specialization = specialization;
  }
  
  public String getName() {
    return name;
  }
  
  public Specialization getSpecialization() {
    return specialization;
  }
  
  public String toString() {
    String patientStr = "";
    patientStr += this.getName() + ", " + this.getSpecialization();
    return patientStr;
  }
  
}
