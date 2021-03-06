package ss11_stack_queue.exercise2;


import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thập phân muốn chuyển đổi: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            int decimal = num % 2;
            stack.push(decimal);
            num /= 2;
        }
        System.out.println("Số nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}

