package ss4_Class_Ojb.Stop_Watch;

public class Mains {
    public static long [] sort(long... a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }return a;
    }

    public static void main(String[] args) {
        long[] a = new long[100000];
        StopWatch_01 sw = new StopWatch_01();

        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 10000);
        }
        sw.start();
        sort(a);
        sw.stop();
        System.out.println();
        System.out.println("Thoi gian de sap xep cho  100.000 so la   :" + sw.getElapsedTime() + " miligiay");

    }
}







