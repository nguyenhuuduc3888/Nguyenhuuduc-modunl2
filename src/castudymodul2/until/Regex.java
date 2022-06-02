package castudymodul2.until;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String input, String regex, String err) {
        boolean check = true;
        do {
            if (input.matches(regex)) {
                check = false;
            } else {
                System.out.println(err);
                input = scanner.nextLine();
            }
        } while (check);
        return input;
    }
}
