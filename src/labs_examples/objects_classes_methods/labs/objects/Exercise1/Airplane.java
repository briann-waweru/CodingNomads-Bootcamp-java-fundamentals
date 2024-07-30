package labs_examples.objects_classes_methods.labs.objects.Exercise1;

public class Airplane {
    private Engine engine;
    private Wing wing;
    private Pilot pilot;
    private double fuelCapacity;
    private double currentFuelLevel;

    //Default Constructor
    public Airplane() {
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    // to String method

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + engine +
                ", wing=" + wing +
                ", pilot=" + pilot +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}
