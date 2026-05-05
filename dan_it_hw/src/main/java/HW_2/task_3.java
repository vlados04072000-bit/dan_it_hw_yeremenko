package HW_2;

import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {

        String text =   "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";

//       1.
        String [] symbols = text.split("a");
        System.out.println(text.length());
        System.out.println(Arrays.toString(symbols));

        System.out.println(text.split("a").length);

//         2.
        int a = text.split("a", -1).length - 1;


        int A = text.split("A", -1).length - 1;

        int total = a + A;

        System.out.println("a " + a);
        System.out.println("A " + A);
        System.out.println("total " + total);

//        3.

        String LT = text.toLowerCase();

        int count = LT.split("a", -1).length - 1;

        System.out.println("count " + count);

//        4.

        int z = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'A') {
                z++;
            }
        }

        System.out.println(z);




    }
}
