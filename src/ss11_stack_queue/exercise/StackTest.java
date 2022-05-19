package ss11_stack_queue.exercise;

import java.util.Arrays;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 78, 46, 6, 6, 56};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        System.out.println("Mãng số nguyên ban đâu là: " + stack.toString());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Sau khi đảo là: " + Arrays.toString(arr) + "\n");

        String chart = "Nguyen Huu Duc";
        char[] arr2 = chart.toCharArray();
        Stack<Character> stackChar = new Stack<>();
        for (char word : arr2) {
            stackChar.push(word);
        }
        System.out.println("Chuỗi ban đầu là: " + stackChar.toString());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = stackChar.pop();
        }
        System.out.println("Sau khi đảo là: " + Arrays.toString(arr2));
    }
}
