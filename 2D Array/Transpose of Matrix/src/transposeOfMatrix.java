import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class transposeOfMatrix{
    public static void main(String[] args) {
        int[][] mat1 = {{1,2}, {4,5}, {7,8}};
        int[][] res = transpose(mat1);
        display(mat1);
        System.out.println();
        display(res);
    }
    public static int[][] transpose(int[][] A){
        int[][] res = new int[A[0].length][A.length];
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}