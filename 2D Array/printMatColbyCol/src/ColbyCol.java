import java.util.*;
public class ColbyCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];

        for(int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printbyCOl(arr);
    }
    public static void printbyCOl(int[][] arr){
        int totalCol = arr[0].length;
        int totalRow = arr.length;
        for(int c = 0; c < totalCol; c++) {
            for (int r = 0; r < totalRow; r++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}

