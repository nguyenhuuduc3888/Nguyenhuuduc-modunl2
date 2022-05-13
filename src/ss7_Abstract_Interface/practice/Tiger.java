package ss7_Abstract_Interface.practice;

public class Tiger extends Animal implements Edible{
 public  String makeSound(){
        return "Hổ hét mèo méo meo";
    }
    @Override
    public String howToEat() {
        return "Hổ có thể nấu giả cầy 12 món .... ";
    }
}
