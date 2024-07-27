package labs_examples.inheritance.labs;

public class Vehicle {
    private String brand;
    private int speed;

    //Constructor

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    //Default constructor
    public Vehicle() {

    }

    //Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printDetails(){
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
