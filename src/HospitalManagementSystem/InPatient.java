package HospitalManagementSystem;

// InPatient subclass
class InPatient extends Patient {
    private int numberOfDays;
    private double dailyRate;

    // Constructor
    public InPatient(String patientId, String name, int age, int numberOfDays, double dailyRate) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    // Implementing the calculateBill() method for InPatient
    @Override
    public double calculateBill() {
        return numberOfDays * dailyRate;
    }
}

