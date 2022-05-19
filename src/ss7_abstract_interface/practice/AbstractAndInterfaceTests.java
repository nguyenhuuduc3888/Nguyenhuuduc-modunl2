package ss7_abstract_interface.practice;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new ChicKen();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof ChicKen) {
                Edible edible = (ChicKen) animal; //
                System.out.println(edible.howToEat());
            }
            if (animal instanceof Tiger) {
                Edible edible1 = (Tiger) animal;
                System.out.println(edible1.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
