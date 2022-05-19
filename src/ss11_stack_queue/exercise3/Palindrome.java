package ss11_stack_queue.exercise3;

import java.util.*;

public class Palindrome {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi muốn kiểm tra: !");
        String chart = scanner.nextLine();
        System.out.println("Chuỗi cần kiểm tra là: " + chart);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        char[] arr = chart.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
            queue.add(arr[i]);
        }
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (stack.pop().equals(queue.poll())) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Đây là 1 palindrome");
        } else {
            System.out.println("Đây không phải 1 palindrome");
        }
    }
}

