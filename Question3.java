package arrayDsa;

public class Question3 {
    public static int max(int[] score){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 1; i<score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
            if(min > score[i]){
                min = score[i];
            }
        }
        System.out.println("minimum score "+min);
        return max;
    }

    public static void main(String[] args){
        int[] score = {100, 80, 76, 39, 90};
        int max = max(score);

        System.out.println("maximum score is "+max);
    }
}
