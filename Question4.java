package arrayDsa;

import java.util.Scanner;

public class Question4 {
    public static void bubbleSort(int[] arr){
        // outerloop - largest element in each iteration
        for(int i = 0; i<arr.length-1; i++){
            boolean swaps = false;
            // innerloop - move largest element at end
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = true;
                }
            }
            if(!swaps){
                break;
            }
        }
        System.out.println("Sorted Array");
    }
    public static void main(String[] args){
        int[] marks = new int[7];

        for(int i = 0; i<marks.length ; i++){
            marks[i] = (int)(Math.random()*10);
        }

        System.out.println("Unsorted Array");
        for(int mark : marks){
            System.out.print(mark+" ");
        }

        System.out.println();
        int[] arr = {1,2, 3,4};
        bubbleSort(arr);

        for(int mark : arr){
            System.out.print(mark+" ");
        }
    }
}


