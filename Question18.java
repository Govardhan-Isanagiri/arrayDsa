package arrayDsa;

import java.util.Scanner;

public class Question18 {
    public static void printMatrix(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr){
        int[][] Tarr = new int[arr[0].length][arr.length];

        for(int i = 0; i<Tarr.length; i++){
            for(int j = 0; j<Tarr[i].length; j++){
                Tarr[i][j] = arr[j][i];
            }
        }
        
        System.out.println("Transposed Array");
        printMatrix(Tarr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];
        

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix");
        printMatrix(arr);
        transpose(arr);
    }
}
