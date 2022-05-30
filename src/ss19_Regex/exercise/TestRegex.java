package ss19_Regex.exercise;

import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String testClassName = "^(C|P|A)[0-9]{4}(G|H|I|K|L|M)$";
        String className1 = "C0123A";
        String className2 = "A0123G";
        String className3 = "@0123g";
        boolean check1 = Pattern.matches(testClassName, className1);
        if (check1) {
            System.out.println("className -- " + className1 + "" + " --Hợp lệ");
        } else System.out.println("className -- " + className1 + "" + " --không hợp lệ");

        boolean check2 = Pattern.matches(testClassName, className2);
        if (check2) {
            System.out.println("className -- " + className2 + "" + " --Hợp lệ");
        } else System.out.println("className -- " + className2 + "" + " --Không hợp lệ");

        boolean check3 = Pattern.matches(testClassName, className3);
        if (check3) {
            System.out.println("className -- " + className3 + "" + " --Hợp lệ");
        } else System.out.println("className -- " + className3 + "" + " --không hợp lệ");
    }
}
