package arrayDsa;

import java.util.Scanner;

public class Question2 {
    public static boolean isPresent(String[] names, String name){
        for(int i = 0; i<names.length; i++){
            if(name.equals(names[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        // input names into names array
        for(int i = 0; i<names.length; i++){
            System.out.print("enter "+(i+1)+" name : ");
            names[i] = sc.nextLine();
        }

        System.out.println("enter name you want to search");
        String name = sc.nextLine();

        boolean isFound = isPresent(names, name);
        
        if(isFound){
            System.out.println(name + " Found");
        }else{
            System.out.println(name + " is not found");
        }
    }
}
