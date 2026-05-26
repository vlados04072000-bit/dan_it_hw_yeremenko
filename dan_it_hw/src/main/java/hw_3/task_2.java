package hw_3;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

//        \(a + b > c\)\(a + c > b\)\(b + c > a\)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:  ");
        int a = scanner.nextInt();
        System.out.println("Enter second number:  ");
        int b = scanner.nextInt();
        System.out.println("Enter third number:  ");
        int c = scanner.nextInt();

        if (a + b > c) {
            System.out.println("You can construct a triangle");
        } else if (a + c > b){
            System.out.println("You can construct a triangle");
        } else if (b + c > a){
            System.out.println("You can construct a triangle");
        } else System.out.println("You can`t construct a triangle");


    }


}
