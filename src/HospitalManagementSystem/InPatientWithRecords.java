package HospitalManagementSystem;

// InPatient with Medical Record functionality
class InPatientWithRecords extends InPatient implements MedicalRecord {
    private StringBuilder medicalHistory = new StringBuilder();

    // Constructor
    public InPatientWithRecords(String patientId, String name, int age, int numberOfDays, double dailyRate) {
        super(patientId, name, age, numberOfDays, dailyRate);
    }

    // Implementing the addRecord() method
    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    // Implementing the viewRecords() method
    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":\n" + medicalHistory.toString());
    }
}

// OutPatient with Medical Record functionality
class OutPatientWithRecords extends OutPatient implements MedicalRecord {
    private StringBuilder medicalHistory = new StringBuilder();

    // Constructor
    public OutPatientWithRecords(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age, consultationFee);
    }

    // Implementing the addRecord() method
    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    // Implementing the viewRecords() method
    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":\n" + medicalHistory.toString());
    }
}
