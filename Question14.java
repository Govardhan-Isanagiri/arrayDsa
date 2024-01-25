package arrayDsa;

import java.util.Scanner;

public class Question14 {

    public static int diagonalSum(int[][] arr){
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length-i-1){
                sum += arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter size of array");
       int n = sc.nextInt();
       int[][] arr = new int[n][n];

       for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr.length; j++){
            arr[i][j] = sc.nextInt();
        }
       }

       for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
       }

       System.out.println("Diagonal sum is "+diagonalSum(arr));
    }
}
