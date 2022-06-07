package exam_modul_2.regex;

import java.util.regex.Pattern;

public class Regex {
    //so duong
    public static boolean numbers(String str) {
        final String VALID_NUMBER = "^\\d{1,}$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    // ngay thang nam
    public static boolean dateFormat(String str) {
        final String VALID_FORMAT_DATE = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }

    public static boolean codeStudent(String str) {
        final String VALID_CODE_STUDENT = "^\\d{8}$";
        Pattern pattern = Pattern.compile(VALID_CODE_STUDENT);
        return pattern.matcher(str).matches();
    }

    public static boolean point(String str) {
        final String VALID_POINT = "^\\d{1}$";
        Pattern pattern = Pattern.compile(VALID_POINT);
        return pattern.matcher(str).matches();
    }

}
