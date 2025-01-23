import java.util.ArrayList;
import java.util.List;

// Hospital class
class Hospital {
    private String name;
    private String location; // assuming location as address
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added to " + name + ":");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Medical History: " + patient.getMedicalHistory());
        System.out.println("------");
    }

    // Remove a doctor from the hospital
    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    // Remove a patient from the hospital
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    // Method to print hospital details
    public void printHospitalDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Hospital Address: " + location);
    }
}

// Doctor class
class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Consult a patient
    public void consult(Patient patient) {
        System.out.println(this.name + " (Specialization: " + specialization + ") is consulting " + patient.getName());
    }

    // Add a patient to the doctor's list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Remove a patient from the doctor's list
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

// Patient class
class Patient {
    private String name;
    private Integer age;
    private String medicalHistory;
    private List<Doctor> doctors;

    public Patient(String name, Integer age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.doctors = new ArrayList<>();
    }

    // Consult a doctor
    public void consult(Doctor doctor) {
        System.out.println(this.name + " is consulting Dr. " + doctor.getName());
    }

    // Add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Remove a doctor from the patient's list
    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

// Main class to test the code
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating a hospital
        Hospital hospital = new Hospital("AwadhShree Hospital", "Awadhpuri Bhopal.");

        // Creating doctors
        Doctor doctor1 = new Doctor("Dr. John", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Sohan", "Pediatrics");

        // Creating patients
        Patient patient1 = new Patient("Aman", 30, "No medical history");
        Patient patient2 = new Patient("Rohan", 50, "Heart disease");

        // Adding doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Adding patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Adding patients to doctors
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Adding doctors to patients
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        // Print hospital details
        hospital.printHospitalDetails();

        // Test consultation
        doctor1.consult(patient2); // Dr. John consults rohan
        patient1.consult(doctor2); // aman consults Dr. sohan
    }
}
