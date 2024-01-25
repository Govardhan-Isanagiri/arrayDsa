package arrayDsa;

public class Question7 {
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {9, 10, 0 ,2 ,1};

        // new array to store frequency
        int[] arr = new int[max(nums)+1];

        // increasing frequency of each element in nums
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        // print in ascending order using frequency array
        for(int i = arr.length-1; i>=0; i--){
            while(arr[i]>0){
                System.out.print(i+" ");
                arr[i]--;
            }
        }
    }
}