import java.util.Random;

public class MatrixDiaganalSum {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i>arr.length-1-j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
