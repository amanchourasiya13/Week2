// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;
import java.util.List;

class Patient {
   private String name;
   private Integer age;
   private String medicalHistory;
   private List<Doctor> doctors;

   public Patient(String var1, Integer var2, String var3) {
      this.name = var1;
      this.age = var2;
      this.medicalHistory = var3;
      this.doctors = new ArrayList();
   }

   public void consult(Doctor var1) {
      String var10001 = this.name;
      System.out.println(var10001 + " is consulting Dr. " + var1.getName());
   }

   public void addDoctor(Doctor var1) {
      this.doctors.add(var1);
   }

   public void removeDoctor(Doctor var1) {
      this.doctors.remove(var1);
   }

   public String getName() {
      return this.name;
   }

   public Integer getAge() {
      return this.age;
   }

   public String getMedicalHistory() {
      return this.medicalHistory;
   }

   public List<Doctor> getDoctors() {
      return this.doctors;
   }
}

// Source code is decompiled from a .class file using FernFlower decompiler.

class Doctor {
   private String name;
   private String specialization;
   private List<Patient> patients;

   public Doctor(String var1, String var2) {
      this.name = var1;
      this.specialization = var2;
      this.patients = new ArrayList();
   }

   public void consult(Patient var1) {
      String var10001 = this.name;
      System.out.println(var10001 + " (Specialization: " + this.specialization + ") is consulting " + var1.getName());
   }

   public void addPatient(Patient var1) {
      this.patients.add(var1);
   }

   public void removePatient(Patient var1) {
      this.patients.remove(var1);
   }

   public String getName() {
      return this.name;
   }

   public String getSpecialization() {
      return this.specialization;
   }

   public List<Patient> getPatients() {
      return this.patients;
   }
}
// Source code is decompiled from a .class file using FernFlower decompiler.
class Hospital {
   private String name;
   private String location;
   private List<Doctor> doctors;
   private List<Patient> patients;

   public Hospital(String var1, String var2) {
      this.name = var1;
      this.location = var2;
      this.doctors = new ArrayList();
      this.patients = new ArrayList();
   }

   public void addDoctor(Doctor var1) {
      this.doctors.add(var1);
   }

   public void addPatient(Patient var1) {
      this.patients.add(var1);
      System.out.println("Patient added to " + this.name + ":");
      System.out.println("Name: " + var1.getName());
      System.out.println("Age: " + var1.getAge());
      System.out.println("Medical History: " + var1.getMedicalHistory());
      System.out.println("------");
   }

   public void removeDoctor(Doctor var1) {
      this.doctors.remove(var1);
   }

   public void removePatient(Patient var1) {
      this.patients.remove(var1);
   }

   public String getName() {
      return this.name;
   }

   public String getLocation() {
      return this.location;
   }

   public List<Doctor> getDoctors() {
      return this.doctors;
   }

   public List<Patient> getPatients() {
      return this.patients;
   }

   public void printHospitalDetails() {
      System.out.println("Hospital Name: " + this.name);
      System.out.println("Hospital Address: " + this.location);
   }
}
// Source code is decompiled from a .class file using FernFlower decompiler.
public class HospitalManagementSystem {
   public HospitalManagementSystem() {
   }

   public static void main(String[] var0) {
      Hospital hos = new Hospital("AwadhShree Hospital", "Awadhpuri Bhopal.");
      Doctor dr1 = new Doctor("Dr. John", "Cardiology");
      Doctor dr2 = new Doctor("Dr. Sohan", "Pediatrics");
      Patient pat1 = new Patient("Aman", 30, "No medical history");
      Patient pat2 = new Patient("Rohan", 50, "Heart disease");
      hos.printHospitalDetails();
      System.out.println();
      hos.addDoctor(dr1);
      hos.addDoctor(dr2);
      hos.addPatient(pat1);
      hos.addPatient(pat2);
      dr1.addPatient(pat2);
      dr2.addPatient(pat1);
      pat1.addDoctor(dr2);
      pat2.addDoctor(dr1);
      dr1.consult(pat2);
      pat1.consult(dr2);
   }
}
