import java.sql.SQLOutput;
import java.util.*;
/*
* You are given two matrices A & B of same size,
* you have to return another matrix which is the sum of A and B.
*
* Example Input 1:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

B = [[9, 8, 7],
     [6, 5, 4],
     [3, 2, 1]]
*
* Example Output
[[10, 10, 10],
 [10, 10, 10],
 [10, 10, 10]]
* */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr1 = new int[M][N];
        int[][] arr2 = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] res = sumOfMatrix(arr1, arr2);
        dispaly(arr1);
        dispaly(arr2);
        dispaly(res);

    }
    public static int[][] sumOfMatrix(int[][] A, int[][] B){
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;
        //Conditon in which additional not possible
        if(r1 != r2 || c1 != c2){
            int[][] bres = new int[0][0];
            return bres;
        }
        int[][] res = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
    public static void dispaly(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
