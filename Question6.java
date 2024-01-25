package arrayDsa;

public class Question6 {
    public static void insertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int prev = i-1;
            // finding position to insert
            while(prev>=0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // inserting element at that position
            arr[prev+1] = current;
        }
    }
    public static void main(String[] args){
        int[] arr = new int[7];

        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }

        System.out.println("Unsorted array");
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Sorted Array");
        insertionSort(arr);

        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
