package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchy;
//Subclass of Vehicle class
public class Car extends Vehicle{
    private final int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Number of Doors: " + numDoors;
    }
}
