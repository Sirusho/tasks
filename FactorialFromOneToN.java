import java.util.Scanner;

public class FactorialFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        String text = scanner.nextLine();
        boolean flag = false;
        for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);
            if (c >= 48 && c <= 57) {
                flag = true;
            } else {
                System.out.println("Invalid input");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            int num = Integer.parseInt(text);
            int i = 1;
            int res = 1;
            while (i <= num) {
                res *= i;
                i++;
            }
            System.out.println("Factorial is -> " + res);
        }
    }
}
