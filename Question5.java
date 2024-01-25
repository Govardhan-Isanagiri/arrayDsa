package arrayDsa;

public class Question5{

    public static void selectionSort(int[] arr){
        // outerloop - to find smalles item in each iteration
        for(int i = 0 ; i<arr.length-1; i++){
            // innerloop - to pick smallest item
            int smaller = Integer.MAX_VALUE;
            int indx = -1;
            for(int j = i; j<arr.length; j++){
                if(arr[j] < smaller){
                    smaller = arr[j];
                    indx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indx];
            arr[indx] = temp;
        }
        System.out.println("Ordered array");
    }
    public static void main(String[] args){
        int[] marks = new int[7];

        for(int i = 0 ; i<marks.length; i++){
            marks[i] = (int)(Math.random()*10);
        }

        System.out.println("Unordered array");
        for(int mark : marks){
            System.out.print(mark+" ");
        }

        System.out.println();
        selectionSort(marks);
        for(int mark : marks){
            System.out.print(mark+" ");
        }
    }
}