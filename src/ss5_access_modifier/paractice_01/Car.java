package ss5_access_modifier.paractice_01;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name,String engine) {
        this.name=name;
        this.engine=engine;
    }

    public static void Carr() {
        numberOfCars++;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void  display() {
        System.out.println(numberOfCars++ + " " + name + " " + engine);
    }
}
