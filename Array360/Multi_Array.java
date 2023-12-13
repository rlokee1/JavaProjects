package Array360;

import java.util.Scanner;

public class Multi_Array {
    //int arr[][] = new int[3][2];
    public static void main(String[] args) {
//        int arr[][] = {{1,2,3},{4,5}};
//        for (int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
        int row = 5;
        //Scanner sc= new Scanner(System.in);
        int arr[][] = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = -0; j < arr[i].length; j++) {
                //arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}
