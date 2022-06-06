package bai_tap_06_06_2022.regex;

import java.util.regex.Pattern;

public class Regex {

    /**
     * Số nguyên và số thập phân
     */
    public static boolean numbers(String str) {
        final String VALID_NUMBER = "^\\d*(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }

    /**
     * Ngày/Tháng/Năm-(dd/MM/yyyy)
     */
    public static boolean dateFormat(String str) {
        final String VALID_FORMAT_DATE = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }

    /**
     * Full Name
     */
    public static boolean formatName(String str) {
        final String VALID_FULL_NAME = "^([A-Z]{1}[a-z]{1,}\\s{1}){1,}([A-Z]{1}[a-z]{1,})$";
        Pattern pattern = Pattern.compile(VALID_FULL_NAME);
        return pattern.matcher(str).matches();
    }

}