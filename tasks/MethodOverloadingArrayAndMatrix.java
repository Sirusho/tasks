public class MethodOverloadingArrayAndMatrix {
    public static void main(String[] args) {
        int array[] = {2, 5, 6, 8, -5};
        int matrix[][] = {{2, 3, 5, 6},
                          {4, 7, 8, 0}};
        System.out.println("sum of the array is -> " + sum(array));
        System.out.println("average of matrix is -> " + sum(matrix));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum / (arr.length*arr[0].length);
    }
}
