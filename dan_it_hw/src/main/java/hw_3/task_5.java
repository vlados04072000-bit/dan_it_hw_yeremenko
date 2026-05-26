package hw_3;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter symbol (+, -, /, %):  ");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter first value:  ");
        int a = scanner.nextInt();

        System.out.println("Enter second value:  ");
        int b = scanner.nextInt();

        int result = (operation == '+') ? (a + b) :
                (operation == '-') ? (a - b) :
                (operation == '*') ? (a * b) :
                (operation == '/') ? (a / b) :
                (operation == '%') ? (a % b) :
                0;
        System.out.println("Result:  " + result);

    }
}
