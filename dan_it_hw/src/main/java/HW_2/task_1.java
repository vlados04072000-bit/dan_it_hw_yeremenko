package HW_2;

public class task_1 {
    public static void main(String[] args) {

        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);

        String string2 = string1.substring(0, 35);
        System.out.println(string2);

        String string3 = string2 + " it is perfect";
        System.out.println(string3);

    }
}
