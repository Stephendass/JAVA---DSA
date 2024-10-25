import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        int N = scn.nextInt();
        for(int i = 0; i < N; i++){
            int rowCount = scn.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
                for(int j = 0; j < rowCount; j++){
                    int val = scn.nextInt();
                    row.add(val);
                }
            mat.add(row);
        }
        System.out.println(mat);
    }
}