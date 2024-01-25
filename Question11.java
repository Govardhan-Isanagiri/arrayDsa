package arrayDsa;

public class Question11 {
    public static void subArraysCount(int[] arr){
        int n = arr.length;
        System.out.println("Count = "+(n*(n+1)/2));
    }

    public static void subArrays(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
         // outerloop to get start
         for(int i = 0; i<arr.length; i++){
            // inner loop is end of sub array
            for(int j = i; j<arr.length; j++){
                int sum = 0;
                // printing sub array
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                System.out.println(" = "+sum);
                if(sum > max){
                    max = sum;
                }
                if(sum < min){
                    min = sum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum sum of subArray is "+max);
        System.out.println("Minimum sum of subArray is "+min);
    }

    public static void main(String[] args){
        int[] nums = {1, -2, 6, -1, 3};
        subArraysCount(nums);
        subArrays(nums);
    }
}
