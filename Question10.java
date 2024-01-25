package arrayDsa;

public class Question10 {
    public static void pairsCount(int[] arr){
        int n = arr.length;
        System.out.println("No.Of pairs "+(n*(n-1)/2));
    }

    public static void pairs(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            int current = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+current+", "+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Count of pairs "+count);
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 30};
        pairsCount(arr);
        pairs(arr);
    }
}
