import java.util.ArrayList;
import java.util.Scanner;

public class print2D{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        int N = scn.nextInt();
        for(int i = 0; i < N; i++) {
            int rowCount = scn.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rowCount; j++) {
                int val = scn.nextInt();
                row.add(val);
            }
            mat.add(row);
        }
        ArrayList<Integer> ans = rowSum(mat);
        System.out.println(ans);
    }

    public static ArrayList<Integer> rowSum(ArrayList<ArrayList<Integer>> mat){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < mat.size(); i++){
           int sum = 0;
           for(int j = 0; j < mat.get(i).size(); j++){
               sum += mat.get(i).get(j);
           }
           ans.add(sum);
        }
        return ans;
    }
}