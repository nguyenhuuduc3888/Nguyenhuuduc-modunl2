package ss5_Access_modifier.practice;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();// GOI PHUONG THUC THAY DOI...

        /**
         * TẠO DOI TUONG...
         */
        Student s1=new Student(0,"TUẤN");
        Student s2= new Student(1,"ĐÔNG");
        Student s3=new Student(2,"ĐỨC KHÔNG");
        /**
         * GọI PHUONG THUC HIEN THI ...
         */
        s1.display();
        s2.display();
        s3.display();

    }
}
