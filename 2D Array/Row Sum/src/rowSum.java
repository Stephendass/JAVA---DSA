import java.util.*;
/*
* Example Input
[1,2,3,4]
[5,6,7,8]
[9,2,3,4]
Example Output : [10,26,18]
* */
public class rowSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i = 0;  i< M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] sum = rowSum(arr);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " " );
        }
    }
    public static int[] rowSum(int[][] arr){
        int totalCol = arr[0].length;
        int totalRow = arr.length;
        int[] rowSums = new int[totalRow];
        for(int i = 0; i < totalRow; i++){
            int sum = 0;
            for(int j = 0; j < totalCol; j++){
                sum += arr[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }
}