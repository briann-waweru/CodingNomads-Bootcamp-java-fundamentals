package labs_examples.objects_classes_methods.labs.objects.Exercise1;

public class Pilot {
    private String name;
    private int yearOfExperience;

    //Default Constructor
    public Pilot() {
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    //to String metho
    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
