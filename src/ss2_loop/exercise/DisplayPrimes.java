package ss2_loop.exercise;

public class DisplayPrimes {
    public static void main(String[] args) {
        int number;
        number = 20;
        int count = 0,n = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n% i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
