package ss5_Access_modifier.paractice_01;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("NVX", "YAMAHA 125 CC");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("VESPA","DIAGA 125 CC");
        System.out.println(Car.numberOfCars);

    }
}
