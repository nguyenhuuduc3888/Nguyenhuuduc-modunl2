package models;

public class Test {
    public static void main(String[] args) {
        Person customer = new Customer();
        Person employee = new Employee();

        Person[] people = new Person[100];


        String level =( (Employee)employee).getLevel();
        String guestType = ((Customer)customer).getGuestType();

        Customer customer1 = new Customer(12, "đuc,", "nam", 13, 34413131, "duc", guestType, "ffs");
        System.out.println(customer1);
    }
}
