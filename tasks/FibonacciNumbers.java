public class FibonacciNumbers {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 0;
        int b = 1;
        arr[0] = a;
        arr[1] = b;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = a + b;
            a = b;
            b = arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}