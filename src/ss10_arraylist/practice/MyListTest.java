package ss10_arraylist.practice;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listInteger = new MyList<>();
        listInteger.add("MOT");
        listInteger.add("HAI");
        listInteger.add("BA");
        listInteger.add("BON");
        listInteger.add("NAM");
        listInteger.add("SAU");
        listInteger.add("BAY");


        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(3));
    }
}
