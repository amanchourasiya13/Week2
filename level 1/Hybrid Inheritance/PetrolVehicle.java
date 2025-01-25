// Subclass: PetrolVehicle, implementing Refuelable
public class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " with " + fuelCapacity + " liters of petrol.");
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
