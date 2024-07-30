package labs_examples.objects_classes_methods.labs.objects.Exercise1;

public class Wing {
    private double length;
    private double width;

    //Default Constructor
    public Wing() {
    }
    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //to String method

    @Override
    public String toString() {
        return "Wing{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
