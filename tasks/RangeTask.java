import java.util.Scanner;

    public class RangeTask {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input a number");
            int number= scanner.nextInt();
            switch (((number+100)/100)){
                case 1:
                    System.out.println("Range is 0 -> 99");
                    break;
                case 2:
                    System.out.println("Range is 100 -> 199");
                    break;
                case 3:
                    System.out.println("Range is 200 -> 299");
                    break;
                default:
                    System.out.println("Range is unknown");
            }
        }
    }
