package labs_examples.objects_classes_methods.labs.oop.A_inheritance.hierarchy;

public class VehicleController {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2010);
        System.out.println(vehicle.getDetails());

        Car car = new Car("Hon", "Civic", 2015, 5);
        System.out.println(car.getDetails());

        ElectricCar elec = new ElectricCar("Tesla", "Model S", 2020, 5, 100);

        System.out.println(elec.getDetails());
    }
}
