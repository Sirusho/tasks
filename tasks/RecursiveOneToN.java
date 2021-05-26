import java.util.Scanner;

public class RecursiveOneToN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
