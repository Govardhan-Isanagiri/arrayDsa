package arrayDsa;

import java.util.Scanner;

public class Question17 {
    public static void sumOf2row(int[][] arr){
        int sum = 0;
        for(int i = 0; i<arr[1].length; i++){
            sum += arr[1][i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of rows");
        int rows = sc.nextInt();
        System.out.println("enter no.of columns");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("enter items in array");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sumOf2row(arr);
    }
}
