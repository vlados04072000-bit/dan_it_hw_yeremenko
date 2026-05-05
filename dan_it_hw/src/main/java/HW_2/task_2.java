package HW_2;

public class task_2 {
    public static void main(String[] args) {

        String string = "Testing, is my favourite job";

        String [] symbols = string.split(" ");

        for (int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i].concat(" ").concat(String.valueOf(symbols[i].length())));
        }
        boolean result = true;
        int arr = symbols[0].length();

        for (int i = 1; i < symbols.length; i++) {
            if (symbols[i].length() >= arr) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
