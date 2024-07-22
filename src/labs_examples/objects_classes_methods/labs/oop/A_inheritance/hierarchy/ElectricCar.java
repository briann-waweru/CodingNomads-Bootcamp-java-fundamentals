package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchy;

//Subclass of Car
public class ElectricCar extends Car{
    private double batteryCapacity;
    public ElectricCar(String make, String model, int year, int numDoors, double batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}
