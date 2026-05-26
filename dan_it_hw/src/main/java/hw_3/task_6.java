package hw_3;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What program are you interested in?");
        String program = scanner.next();

        System.out.println("For which operating system");
        String operatingsystem = scanner.next();

        switch (program) {
            case "IntelliJ IDEA":
                switch (operatingsystem) {
                    case "Windows":
                        System.out.println("https://www.jetbrains.com/idea/download/");
                        break;

                    case "Linux":
                        System.out.println("https://www.jetbrains.com/idea/download/#linux");
                        break;

                    case "MacOS":
                        System.out.println("https://www.jetbrains.com/idea/download/#mac");
                        break;

                    default:
                        System.out.println("There is no such operating system.");
                }
                break;

            case "Git":
                switch (operatingsystem) {
                    case "Windows":
                        System.out.println("https://git-scm.com/download/win");
                        break;

                    case "Linux":
                        System.out.println("https://git-scm.com/download/linux");
                        break;

                    case "MacOS":
                        System.out.println("https://git-scm.com/download/mac");
                        break;

                    default:
                        System.out.println("There is no such operating system.");
                }
                break;

            case "Java":
                switch (operatingsystem) {
                    case "Windows":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/");
                        break;

                    case "Linux":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/");
                        break;

                    case "MacOS":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/");
                        break;

                    default:
                        System.out.println("There is no such operating system.");
                }
                break;

            default:
                System.out.println("Such a program does not exist.");

        }

    }







}
