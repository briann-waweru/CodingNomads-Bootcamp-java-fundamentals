package labs_examples.inheritance.labs;

public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    //Constructor
    public Car(String brand, int speed, int doors, String fuelType) {
        super(brand, speed);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    //Overloaded Constructor
    public Car() {
        super(); //Calls the default constructor of the parent class (Vehicle)
        this.doors = 4;
        this.fuelType = "Diesel";
    }

    //Getters and Setters
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Method to demonstrate using a superclass method
    public void demonstrateSuperClassMethod() {
        printDetails(); // Calling a method from the superclass
    }

    // Method overloading
    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void startEngine(String keyType) {
        System.out.println("Starting engine with " + keyType + " key...");
    }
}
