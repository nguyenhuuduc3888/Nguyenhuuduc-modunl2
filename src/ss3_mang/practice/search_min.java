package ss3_mang.practice;

public class search_min {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("So nho nhat trong mang la: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }
        return min;
    }
}
