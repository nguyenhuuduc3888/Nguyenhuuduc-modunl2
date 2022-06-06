package bai_tap_06_06_2022.regex;

import java.util.regex.Pattern;

public class Regex {
    public static boolean intNum(String str) {
        final String VALID_NUMBER = "^\\d+$"; // nhap so bat ky
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }
}
