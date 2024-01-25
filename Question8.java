package arrayDsa;

public class Question8 {
    public static boolean search(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(key > arr[mid]){
                left = mid + 1;
            }else if(key < arr[mid]){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = new int[7];

        // input elements to arr
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        int key = 3;
        if(search(arr, key)){
            System.out.println(key+" is found");
        }else{
            System.out.println(key+" is not found");
        }
    }
}
