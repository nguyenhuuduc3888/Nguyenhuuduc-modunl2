package exam_modul_2.until;

import bai_tap_07_06_2022.models_seven.Student;
import bai_tap_07_06_2022.models_seven.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileExam {

    public static void writeFile(String pathFile, List<String> list) {
        File file = new File(pathFile);
        try (
                FileWriter fileWriter = new FileWriter(pathFile, false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String data : list) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
    Ghi file chi tiết từng đối tượng....
     */
    public static void writeStudent(String pathFile, List<Student> student) {
        List<String> list = new ArrayList<>();
        for (Student item : student) {
            list.add(item.inFor());
        }
        writeFile(pathFile, list);
    }

    /**
     Ghi file chi tiết từng đối tượng....
     */
    public static void writeTeacher(String pathFile, List<Teacher> teachers) {
        List<String> list = new ArrayList<>();
        for (Teacher item : teachers) {
            list.add(item.inFor());
        }
        writeFile(pathFile, list);
    }

    public static List<String> readFile(String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals(""))
                    list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     Đọc file chi tiết từng đối tượng....
     */
    public static List<Student> readStudent(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Student> studentsList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            studentsList.add(new Student(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], item[5], item[6]));
        }
        return studentsList;
    }

    /**
     Đọc file chi tiết từng đối tượng....
     */
    public static List<Teacher> readTeacher(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Teacher> teachersList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            teachersList.add(new Teacher(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4], item[5], item[6], item[7]));
        }
        return teachersList;
    }

}
