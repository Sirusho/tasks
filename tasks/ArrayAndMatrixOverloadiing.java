public class ArrayAndMatrixOverloadiing {
    public static void main(String[] args) {
        int array[]={2, -5, 4, -7};
        int matrix[][]={{1, 1, 1, 1},
                        {2,2, 2, 2}};

        printArray(returnArray(array));
        System.out.println(" \n Matrix \n");
       printArray(returnArray(matrix));
          }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
//    public static void printMatrix(int arr[][]){
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
    public static int [] returnArray(int arr[][]){
        int[] newArr=new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            int k=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                newArr[i]=sum / arr[i].length;
            }
            }
        return newArr;
    }
    public static int [] returnArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]*=-1;
        }
        return arr;
    }
}
