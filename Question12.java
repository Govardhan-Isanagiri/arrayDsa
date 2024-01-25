package arrayDsa;

import java.util.Scanner;

public class Question12 {
    public static void display(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void maxMin(int[][] arr){
        int min = arr[0][0];
        int max = arr[0][0];

        for(int i = 0; i<arr.length ; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("maximum value "+max);
        System.out.println("minimum value "+min);
    }
    
    public static void main(String[] args){
       int[][] array = new int[3][3];

       Scanner sc = new Scanner(System.in);
       for(int i=0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                array[i][j] = sc.nextInt();
            }
       }
       display(array);
       maxMin(array);
    }
}