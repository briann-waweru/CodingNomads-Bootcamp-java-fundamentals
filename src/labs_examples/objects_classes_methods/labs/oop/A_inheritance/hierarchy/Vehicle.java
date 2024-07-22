package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchy;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Default Constructor
    public Vehicle() {
    }

    //Getters and Setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Method
    public String getDetails() {
        return "Make: " + make + "\nModel: " + model + "\nYear: " + year;
    }
}
