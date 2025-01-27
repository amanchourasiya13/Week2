package HospitalManagementSystem;

public class HospitalManagement {
    public static void main(String[] args) {
        // Creating an InPatient and an OutPatient
        InPatient inPatient = new InPatient("IP123", "John Doe", 45, 10, 500);
        OutPatient outPatient = new OutPatient("OP456", "Jane Doe", 30, 200);

        // Using polymorphism to calculate bills dynamically
        Patient[] patients = {inPatient, outPatient};

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: $" + patient.calculateBill());
            System.out.println("------------------------------");
        }

        // Creating InPatientWithRecords and adding/viewing medical records
        InPatientWithRecords inPatientWithRecords = new InPatientWithRecords("IP789", "Alice Smith", 60, 5, 600);
        inPatientWithRecords.addRecord("Diagnosis: Severe flu.");
        inPatientWithRecords.addRecord("Treatment: Antibiotics.");
        inPatientWithRecords.viewRecords();
    }
}
