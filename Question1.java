package arrayDsa;

import java.util.Scanner;

public class Question1 {

    public static int search(int[] score, int key){
        for(int i = 0; i<score.length; i++){
            if(score[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];

        // inputing scores into the array
        for(int i = 0; i<score.length; i++){
            System.out.print("enter score in "+(i+1)+" subject : ");
            score[i] = sc.nextInt();
        }

        System.out.println("enter score you want to search");
        int key = sc.nextInt();

        int isPresent = search(score, key);

        if(isPresent == -1){
            System.out.println("Not Present");
        }else{
            System.out.println("score present at index "+isPresent);
        }
    }
}
