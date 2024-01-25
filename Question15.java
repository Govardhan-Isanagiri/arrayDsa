package arrayDsa;

import java.util.Scanner;

public class Question15 {
    public static String search(int[][] arr, int key){
        int i = arr.length-1;
        int j = 0;
        while(i>=0 && j<=arr[i].length-1){
            if(key == arr[i][j]){
                return "found at ("+i+","+j+")";
            }else if(key < arr[i][j]){
                i--;
            }else{
                j++;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of rows");
        int rows = sc.nextInt();
        System.out.println("enter no.of columns");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("enter key to search");
        int key = sc.nextInt();
        System.out.println(search(arr, key));
    }
}
