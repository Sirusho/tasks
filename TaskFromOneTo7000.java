public class TaskFromOneTo7000 {
        public static void main(String[] args) {
            int arr[]=new int[1000];
           int i=0;
            while (i<arr.length){
                for (int j = 1; j <= 7000; j++) {
                    if (j % 7 == 0) {
                        arr[i] = j;
                        System.out.print(arr[i] + " ");
                        i++;
                    }
                }
            }

        }
    }
