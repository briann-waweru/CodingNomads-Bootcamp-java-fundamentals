package labs_examples.objects_classes_methods.labs.objects.Exercise1;

public class Engine {
    private String model;
    private int horsepower;

    //Default Constructor
    public Engine() {
    }
    //Getters and Setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    //to string method

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}
