package gaithuat;

public class GiaiThuat {
    public static void main(String[] args) {
        String str = "CodegymDaNang";
        char[] newStr = str.toCharArray();
        for (int i = 0; i < newStr.length; i++) {
            for (int j = 0; j < newStr.length; j++) {
                if (newStr[i] == newStr[j]) {
                    newStr[i] = newStr[j];
                }
            }
        }
    }
}
