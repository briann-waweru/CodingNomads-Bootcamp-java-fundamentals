package labs_examples.inheritance.labs;

class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;

    // Constructor
    public ElectricCar(String brand, int speed, int doors, String fuelType, int batteryCapacity, int range) {
        super(brand, speed, doors, fuelType); // Using superclass constructor
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    // Overloaded Constructor
    public ElectricCar() {
        super(); // Calls the default constructor of the superclass
        this.batteryCapacity = 100;
        this.range = 300;
    }

    // Getters and Setters
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    // Demonstrate setting superclass variables from a subclass
    public void setSuperClassVariables(String brand, int speed) {
        setBrand(brand); // Set superclass variable brand
        setSpeed(speed); // Set superclass variable speed
    }

    // Demonstrate constructor overloading and the use of "super" keyword
    public ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed); // Calls the overloaded constructor of the superclass
        this.batteryCapacity = batteryCapacity;
        this.range = 200; // Default value
    }
}
