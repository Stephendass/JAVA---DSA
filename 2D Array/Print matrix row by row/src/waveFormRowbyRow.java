import java.util.*;
/*
* Problem Description
Given a matrix of M rows and N columns, print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.

 */
public class waveFormRowbyRow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printRowbyRow(arr);
    }
    public static void printRowbyRow(int[][] arr){
        int totalCol = arr[0].length;
        int totalRow = arr.length;
        for(int r = 0; r < totalRow; r++){
            if(r % 2 == 0){
                for(int c = 0; c < totalCol; c++){
                    System.out.print(arr[r][c]+" ");
                }
            } else {
                for(int c = totalCol-1; c >=0; c--){
                    System.out.print(arr[r][c] + " ");
                }
            }
//            System.out.println();
        }
    }
}