import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class waveform{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        //take input from user
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printwaveformCol(arr);
    }
    public static void printwaveformCol(int[][] arr){
        int totalCol = arr[0].length;
        int totalRow = arr.length;

        for(int c = 0; c < totalCol; c++){
            if(c % 2 == 0){
                for(int r = 0; r < totalRow; r++){
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for(int r = totalRow-1; r >=0; r--){
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
        System.out.println();
    }
}