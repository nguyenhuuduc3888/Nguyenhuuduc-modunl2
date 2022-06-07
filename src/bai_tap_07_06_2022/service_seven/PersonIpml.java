package bai_tap_07_06_2022.service_seven;

import bai_tap_07_06_2022.exception_seven.BirthdayException;
import bai_tap_07_06_2022.models_seven.Person;
import bai_tap_07_06_2022.models_seven.Student;

import bai_tap_07_06_2022.models_seven.Teacher;
import bai_tap_07_06_2022.regex_seven.RegexSeven;
import bai_tap_07_06_2022.until_seven.CompareBirthday;
import bai_tap_07_06_2022.until_seven.CompareName;
import bai_tap_07_06_2022.until_seven.ReadWriteFileSeven;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PersonIpml implements Service {
    static Scanner scanner = new Scanner(System.in);

    final String PATH_FILE_ST = "src\\bai_tap_07_06_2022\\data\\student_file.csv";
    final String PATH_FILE_TC = "src\\bai_tap_07_06_2022\\data\\teacher_file.csv";

    List<Person> people = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();

    @Override
    public void display() {
        students = ReadWriteFileSeven.readStudent(PATH_FILE_ST);
        teachers = ReadWriteFileSeven.readTeacher(PATH_FILE_TC);

        for (Student student : students) {
            people.add(student);
        }
        for (Teacher teacher : teachers) {
            people.add(teacher);
        }

        for (Person item : people) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        students = ReadWriteFileSeven.readStudent(PATH_FILE_ST);
        teachers = ReadWriteFileSeven.readTeacher(PATH_FILE_TC);

        do {
            System.out.println("---Chọn kiểu muốn thêm---\n" +
                    "1.Add Student\n" +
                    "2.Add Teacher\n" +
                    "3.Thoát" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Nhập tên Học Sinh ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập Giới Tính ");
                    String gender = scanner.nextLine();

                    String dayOfBirth;
                    do {
                        try {
                            System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
                            dayOfBirth = scanner.nextLine();
                            LocalDate dayNow = LocalDate.now();
                            LocalDate birthDay = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/LL/yyyy"));
                            if (RegexSeven.dateFormat(dayOfBirth) && birthDay.plusYears(18).isBefore(dayNow)) {
                                break;
                            } else throw new BirthdayException("Tuổi phải lớn hơn 18");
                        } catch (BirthdayException | DateTimeParseException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);

                    System.out.print("Nhập Địa chỉ ");
                    String address = scanner.nextLine();

                    String codeStudent;
                    do {
                        System.out.print("Nhập mã số học sinh ");
                        codeStudent = scanner.nextLine();
                        if (RegexSeven.codeStudent(codeStudent)) {
                            break;
                        } else System.out.println("Nhập lại");
                    } while (true);

                    String point;
                    do {
                        System.out.print("Nhập Điểm hoc sinh ");
                        point = scanner.nextLine();
                        if (RegexSeven.point(point)) {
                            break;
                        } else System.out.println("Nhập lại");
                    } while (true);


                    int max1 = 0;
                    int id;
                    if (students.isEmpty()) {
                        id = 1;
                    } else {
                        for (Student item1 : students) {
                            if (item1.getId() > max1) {
                                max1 = item1.getId();
                            }
                        }
                        id = max1 + 1;
                    }

                    Student student = new Student(id, name, gender, dayOfBirth, address, codeStudent, point);
                    students.add(student);

                    ReadWriteFileSeven.writeStudent(PATH_FILE_ST, students);
                    System.out.println("Đã thêm mới thành công");
                    break;

                case "2":
                    System.out.print("Nhập tên Giáo Viên ");
                    String name1 = scanner.nextLine();

                    System.out.print("Nhập Giới Tính ");
                    String gender1 = scanner.nextLine();

                    String dayOfBirth1;
                    do {
                        try {
                            System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
                            dayOfBirth1 = scanner.nextLine();
                            LocalDate dayNow = LocalDate.now();
                            LocalDate birthDay = LocalDate.parse(dayOfBirth1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            if (RegexSeven.dateFormat(dayOfBirth1) && birthDay.plusYears(18).isBefore(dayNow)) {
                                break;
                            } else throw new BirthdayException("Tuổi phải lớn hơn 18");
                        } catch (BirthdayException | DateTimeParseException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);

                    System.out.print("Nhập Địa chỉ ");
                    String address1 = scanner.nextLine();

                    System.out.print("Nhập Lớp dạy");
                    String classes = scanner.nextLine();

                    String salary;
                    do {
                        System.out.println("Nhập lương phải là số dương");
                        salary = scanner.nextLine();
                        if (RegexSeven.numbers(salary)) {
                            break;
                        } else System.out.println("Nhập lại");
                    } while (true);

                    String hours;
                    do {
                        System.out.println("Nhập số giờ dạy phải là số dương");
                        hours = scanner.nextLine();
                        if (RegexSeven.numbers(hours)) {
                            break;
                        } else System.out.println("Nhập lại");
                    } while (true);


                    int max = 0;
                    int id1;
                    if (teachers.isEmpty()) {
                        id1 = 1;
                    } else {
                        for (Teacher item1 : teachers) {
                            if (item1.getId() > max) {
                                max = item1.getId();
                            }
                        }
                        id1 = max + 1;
                    }

                    Teacher teacher = new Teacher(id1, name1, gender1, dayOfBirth1, address1, classes, salary, hours);
                    teachers.add(teacher);

                    ReadWriteFileSeven.writeTeacher(PATH_FILE_TC, teachers);
                    System.out.println("Đã thêm mới thành công");

                    break;
                case "3":
                    System.out.println("THOÁT CHỌN");
                    return;
                default:
                    System.err.println("ChƯƠNG TRÌNH YÊU CẦU CHỌN 1---4");
            }
        } while (true);
    }

    @Override
    public void update() {
        System.out.println("1.Sửa HỌC SINH\n" +
                "2.SỬA GIÁO VIÊN\n" +
                "3.Back menu\n" +
                "Nhập để chọn");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                students = ReadWriteFileSeven.readStudent(PATH_FILE_ST);
                System.out.println("Nhập id muốn tìm");
                int choiceId = Integer.parseInt(scanner.nextLine());

                boolean check = true;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getId() == choiceId) {
                        System.out.print("Nhập tên Học Sinh ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập Giới Tính ");
                        String gender = scanner.nextLine();

                        String dayOfBirth;
                        do {
                            try {
                                System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
                                dayOfBirth = scanner.nextLine();
                                LocalDate dayNow = LocalDate.now();
                                LocalDate birthDay = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/LL/yyyy"));
                                if (RegexSeven.dateFormat(dayOfBirth) && birthDay.plusYears(18).isBefore(dayNow)) {
                                    break;
                                } else throw new BirthdayException("Tuổi phải lớn hơn 18");
                            } catch (BirthdayException e) {
                                System.out.println(e.getMessage());
                            }
                        } while (true);

                        System.out.print("Nhập Địa chỉ ");
                        String address = scanner.nextLine();

                        String codeStudent;
                        do {
                            System.out.print("Nhập mã số học sinh ");
                            codeStudent = scanner.nextLine();
                            if (RegexSeven.codeStudent(codeStudent)) {
                                break;
                            } else System.out.println("Nhập lại");
                        } while (true);

                        String point;
                        do {
                            System.out.print("Nhập Điểm hoc sinh ");
                            point = scanner.nextLine();
                            if (RegexSeven.point(point)) {
                                break;
                            } else System.out.println("Nhập lại");
                        } while (true);

                        students.get(i).setId(choiceId);
                        students.get(i).setCodeStudent(codeStudent);
                        students.get(i).setPoint(point);
                        students.get(i).setAddress(address);
                        students.get(i).setName(name);
                        students.get(i).setDayOfBirth(dayOfBirth);
                        students.get(i).setGender(gender);

                        ReadWriteFileSeven.writeStudent(PATH_FILE_ST, students);
                        System.out.println("Đã thêm mới thành công");

                    } else check = true;
                }
                if (check) {
                    System.out.println("Không tìm thấy");
                }


                break;
            case "2":
                teachers = ReadWriteFileSeven.readTeacher(PATH_FILE_TC);

                System.out.println("Nhập id muốn tìm");
                int choiceId1 = Integer.parseInt(scanner.nextLine());

                boolean check1 = true;
                for (int i = 0; i < teachers.size(); i++) {
                    if (teachers.get(i).getId() == choiceId1) {
                        System.out.print("Nhập tên Giáo Viên ");
                        String name1 = scanner.nextLine();

                        System.out.print("Nhập Giới Tính ");
                        String gender1 = scanner.nextLine();

                        String dayOfBirth1;
                        do {
                            try {
                                System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
                                dayOfBirth1 = scanner.nextLine();
                                LocalDate dayNow = LocalDate.now();
                                LocalDate birthDay = LocalDate.parse(dayOfBirth1, DateTimeFormatter.ofPattern("dd/LL/yyyy"));
                                if (RegexSeven.dateFormat(dayOfBirth1) && birthDay.plusYears(18).isBefore(dayNow)) {
                                    break;
                                } else throw new BirthdayException("Tuổi phải lớn hơn 18");
                            } catch (BirthdayException e) {
                                System.out.println(e.getMessage());
                            }
                        } while (true);

                        System.out.print("Nhập Địa chỉ ");
                        String address1 = scanner.nextLine();

                        System.out.print("Nhập Lớp dạy");
                        String classes = scanner.nextLine();

                        String salary;
                        do {
                            System.out.println("Nhập lương phải là số dương");
                            salary = scanner.nextLine();
                            if (RegexSeven.numbers(salary)) {
                                break;
                            } else System.out.println("Nhập lại");
                        } while (true);

                        String hours;
                        do {
                            System.out.println("Nhập lương phải là số dương");
                            hours = scanner.nextLine();
                            if (RegexSeven.numbers(hours)) {
                                break;
                            } else System.out.println("Nhập lại");
                        } while (true);

                        teachers.get(i).setClasses(classes);
                        teachers.get(i).setHours(hours);
                        teachers.get(i).setSalary(salary);
                        teachers.get(i).setAddress(address1);
                        teachers.get(i).setGender(gender1);
                        teachers.get(i).setId(choiceId1);
                        teachers.get(i).setDayOfBirth(dayOfBirth1);
                        teachers.get(i).setName(name1);

                        ReadWriteFileSeven.writeTeacher(PATH_FILE_TC, teachers);
                        System.out.println("Đã sửa thành công");

                    } else check1 = true;

                }
                if (check1 == true) {
                    System.out.println("không tìm thấy");
                }
                break;
            case "3":
                return;
            default:
                System.out.println("Chọn 1-3");
        }
    }

    @Override
    public void remove() {
        do {
            System.out.println("---Chọn kiểu muốn xoá---\n" +
                    "1. Student\n" +
                    "2.Teacher\n" +
                    "3.Thoát" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    students = ReadWriteFileSeven.readStudent(PATH_FILE_ST);

                    System.out.println("NHAP ID  MUON XOA..");
                    int id = Integer.parseInt(scanner.nextLine());

                    boolean check = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId() == id) {
                            System.out.println("CHỌN 1-XOÁ\n" +
                                    "CHỌN 2-QUAY LẠI\n" +
                                    "NHẬP ĐỂ CHỌN");

                            String choice = scanner.nextLine();
                            switch (choice) {
                                case "1":
                                    students.remove(i);
                                    System.out.println("Xoá thành công ");
                                    break;
                                case "2":
                                    return;
                                default:
                                    System.out.println("CHỈ ĐƯỢC CHỌN 1-2");
                            }
                        } else {
                            check = true;
                        }
                    }
                    if (check == true) {
                        System.out.println("Không tìm thấy");
                    }
                    ReadWriteFileSeven.writeStudent(PATH_FILE_ST, students);
                    break;
                case "2":
                    teachers = ReadWriteFileSeven.readTeacher(PATH_FILE_TC);

                    System.out.println("NHAP ID  MUON XOA..");
                    int id1 = Integer.parseInt(scanner.nextLine());

                    boolean check1 = false;
                    for (int i = 0; i < teachers.size(); i++) {
                        if (teachers.get(i).getId() == id1) {
                            System.out.println("CHỌN 1-XOÁ\n" +
                                    "CHỌN 2-QUAY LẠI\n" +
                                    "NHẬP ĐỂ CHỌN");

                            String choice = scanner.nextLine();
                            switch (choice) {
                                case "1":
                                    teachers.remove(i);
                                    System.out.println("Xoá thành công ");
                                    break;
                                case "2":
                                    return;
                                default:
                                    System.out.println("CHỈ ĐƯỢC CHỌN 1-2");
                            }
                        } else {
                            check1 = true;
                        }
                    }
                    if (check1 == true) {
                        System.out.println("Không tìm thấy");
                    }
                    ReadWriteFileSeven.writeTeacher(PATH_FILE_TC, teachers);
                case "3":
                    return;
                default:
                    System.out.println("Chon 1-3");
            }
        } while (true);
    }

    @Override
    public void sort() {
        System.out.println("Chon 1 de sap xep theo ten\n" +
                "Chon 2 de sap xep theo ngay\n" +
                "Chon 3 de thoat\n" +
                "Nhap de chon");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                students = ReadWriteFileSeven.readStudent(PATH_FILE_ST);
                CompareName compareName = new CompareName();
                Collections.sort(students, compareName);
                for (Student list : students) {
                    System.out.println(list);
                }

                teachers = ReadWriteFileSeven.readTeacher(PATH_FILE_TC);
                CompareName compareName1 = new CompareName();
                Collections.sort(teachers, compareName1);
                for (Teacher list : teachers) {
                    System.out.println(list);
                }
                break;
            case "2":
                students = ReadWriteFileSeven.readStudent(PATH_FILE_ST);
                CompareBirthday compareBirthday = new CompareBirthday();
                Collections.sort(students, compareBirthday);
                for (Student list : students) {
                    System.out.println(list);
                }

                teachers = ReadWriteFileSeven.readTeacher(PATH_FILE_TC);
                CompareBirthday compareBirthday1 = new CompareBirthday();
                Collections.sort(teachers, compareBirthday1);
                for (Teacher list : teachers) {
                    System.out.println(list);
                }
                break;
            case "3":
                return;
            default:
                System.out.println("Nhap 1-3");
        }
    }
}
