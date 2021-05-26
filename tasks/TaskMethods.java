import java.util.Random;

public class TaskMethods {
    public static void main(String[] args) {
        int arr[][] = intializeArray(5);
        printArray(arr);
        System.out.println("\n Reversed array \n");
        printArray(reverseElementsSign(arr));
    }

    public static int[][] intializeArray(int size) {
        int arr[][] = new int[size][size];
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] =random.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] reverseElementsSign(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] *= -1;
            }
        }
        return arr;
    }
}
