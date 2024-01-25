package arrayDsa;

import java.util.Scanner;

public class Question16 {
    public static void find7(int[][] arr){
        int count = 0;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("No.of 7's in 2d array "+count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of rows");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        System.out.println("enter columns");
        for(int i = 0; i<arr.length ; i++){
            arr[i] = new int[sc.nextInt()];
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        find7(arr);
    }
}
