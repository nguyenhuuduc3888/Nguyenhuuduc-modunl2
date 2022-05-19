package ss5_access_modifier.paractice_01;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car.Carr();
        Car car1 = new Car("NVX", "YAMAHA 125 CC");
        Car car2 = new Car("VESPA","DIAGO 125 CC");
      car1.display();
      car2.display();
    }
}
