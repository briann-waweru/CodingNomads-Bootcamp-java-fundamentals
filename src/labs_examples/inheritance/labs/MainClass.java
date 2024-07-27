package labs_examples.inheritance.labs;

public class MainClass {
    public static void main(String[] args) {
        // Create an instance of ElectricCar
        ElectricCar myTesla = new ElectricCar("Tesla", 150, 4, "Electric", 85, 400);

        // Setting superclass variables from a subclass
        myTesla.setSuperClassVariables("Tesla Model S", 200);

        // The use of (non getter and setter) methods in a superclass from a subclass
        myTesla.demonstrateSuperClassMethod(); // This should call printDetails() from Vehicle

        // Demonstrate method overloading
        myTesla.startEngine();
        myTesla.startEngine("smart");

        // Demonstrate constructor overloading and the use of the "super" keyword
        ElectricCar anotherTesla = new ElectricCar("Tesla Model 3", 160, 75);
        anotherTesla.demonstrateSuperClassMethod(); // This should call printDetails() from Vehicle
    }
}

