package arrayDsa;
public class Question13 {
    public static void spiral(int[][] arr){
        int rowStart = 0;
        int rowEnd = arr.length-1;
        int columnStart = 0;
        int columnEnd = arr[0].length-1;

        while(rowStart <= rowEnd && columnStart <= columnEnd){
            // top
            for(int i = columnStart; i<=columnEnd; i++){
                System.out.print(arr[rowStart][i]+" ");
            }

            // right
            for(int i = rowStart+1; i<=rowEnd; i++){
                System.out.print(arr[i][columnEnd]+" ");
            }

            // bottom
            for(int i = columnEnd-1; i>=columnStart; i--){
                System.out.print(arr[rowEnd][i]+" ");
            }

            // left
            for(int i = rowEnd-1; i>rowStart; i--){
                System.out.print(arr[i][columnStart]+" ");
            }

            rowStart++;
            rowEnd--;
            columnStart++;
            columnEnd--;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        spiral(arr);
    }
}
