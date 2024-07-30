package labs_examples.objects_classes_methods.labs.objects.Exercise1;

public class ControllerClass {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModel("V8");
        engine.setHorsepower(123333);

        Wing wing = new Wing();
        wing.setLength(50.0);
        wing.setWidth(10.0);

        Pilot pilot = new Pilot();
        pilot.setName("John Doe");
        pilot.setYearOfExperience(34);

        Airplane airplane = new Airplane();
        airplane.setEngine(engine);
        airplane.setWing(wing);
        airplane.setPilot(pilot);

        //Printing to-string methods
        System.out.println();

        System.out.println("Engine Model: " + airplane.getEngine().getModel());
        airplane.getEngine().setModel("PW4000");
        System.out.println("Updated Engine Model: " + airplane.getEngine().getModel());

        System.out.println("Wing Length: " + airplane.getWing().getLength());
        airplane.getWing().setLength(62.0);
        System.out.println("Updated Wing Length: " + airplane.getWing().getLength());

        System.out.println("Pilot Name: " + airplane.getPilot().getName());
        airplane.getPilot().setName("Jane Doe");
        System.out.println("Updated Pilot Name: " + airplane.getPilot().getName());

        // Demonstrating toString methods
        System.out.println(airplane.getEngine().toString());
        System.out.println(airplane.getWing().toString());
        System.out.println(airplane.getPilot().toString());
        System.out.println(airplane);





    }
}
