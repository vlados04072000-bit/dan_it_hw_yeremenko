package hw_3;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:  ");
        int a = scanner.nextInt();

        System.out.println("Enter second number:  ");
        int b = scanner.nextInt();

        int eqal = (a > b) ? (a - b) : (b - a);
        System.out.println("Difference:" + " " + eqal);

    }



}
