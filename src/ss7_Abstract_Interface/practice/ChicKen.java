package ss7_Abstract_Interface.practice;

public class ChicKen extends Animal implements Edible {//lớp chicken kế thừa lớp Animal và triển khải các phương thức của interface
    @Override
    public String makeSound(){
        return "Gà sủa go go"; }

    @Override
    public String howToEat() {//triển khai phương thức được khai báo trong interface Edible
        return "Gà có thể chiên mắm, luộc xé phay ..nhậu với bia keke ";
    }
}
