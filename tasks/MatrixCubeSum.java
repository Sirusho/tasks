import java.util.Random;

public class MatrixCubeSum {
    public static void main(String[] args) {
        int arr[][][] = new int[4][4][4];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] = random.nextInt(10);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j<=i) {
                    sum += arr[i][i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
