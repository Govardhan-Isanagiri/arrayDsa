package arrayDsa;

public class Question9 {
    public static void reversedArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        printArry(arr);
    }

    public static void printArry(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = new int[6];

        // input values to arr
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*20);
        }

        System.out.println("Original array");
        printArry(arr);
        System.out.println("Reversed Array");
        reversedArray(arr);
    }
}
