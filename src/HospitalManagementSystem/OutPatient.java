package HospitalManagementSystem;

// OutPatient subclass
class OutPatient extends Patient {
    private double consultationFee;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Implementing the calculateBill() method for OutPatient
    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
