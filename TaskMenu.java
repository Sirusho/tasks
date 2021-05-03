import java.util.Scanner;

public class TaskMenu {
    public static void main(String[] args) {
        int radius = 3;
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" --- Menu --- \n" + "Press 1 for perimeter \n" + "Press 2 for area \n" + "Press 3 to exit");
            String text = scanner.nextLine();
            if (text.equals("2")) {
                System.out.println(2 * Math.PI * radius);
            } else if (text.equals("1")) {
                System.out.println(Math.PI * Math.pow(radius, 2));
            } else if (text.equals("3")) {
                flag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
