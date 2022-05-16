package castudy_modul2.models;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[100];
        Person customer = new Customer();
        Person employee = new Employee();
        String Location = ((Employee) employee).getLocation();//tao kieu string hung gia tri cua phuong thuc Location..
        String level = ((Employee) employee).getLevel();//tao kieu level hung gia trị cua phuong thuc Level...
        Employee employee1 = new Employee(1, "HUUDUC", "NAM", 1, 54545, "@123", level, Location, 11);
        System.out.println(employee1);

        String guestType = ((Customer) customer).getGuestType();//tao kieu string hung gia tri cua phuong thuc GuestType...
        Customer customer1 = new Customer(12, "đuc,", "nam", 13, 34413131, "duc", guestType, "ffs");
        System.out.println(customer1);
    }
}
