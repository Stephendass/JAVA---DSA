import java.util.ArrayList;
import java.util.Scanner;

public class FreqCount{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int N = scn.nextInt();
        for(int i = 0; i < N; i++){
            list.add(scn.nextInt());
        }
        ArrayList<Integer> result = solve(list);
        for(int j = 0; j < result.size(); j++){
            System.out.print(result.get(j) + " ");
        }
        scn.close();
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        int N = A.size();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < N; j++){
                if(A.get(j).equals(A.get(i))){
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}
/* Problem Description
 *You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
 * When comparing two elements of the ArrayList(java), make sure to use .equals() method for accurate comparison.
 * To compare ith index with jth index use A.get(i).equals(A.get(j)).
 *
 *                            ith index                      1 2 3 4 5 6 7 8 9 10
 * Input Format : Give integers and its count first{Eg: (10) 1 3 5 1 8 3 2 3 1 5}
 * Output Format:Return an integers {Eg o/p for above i/p is 3 3 2 3 1 3 1 3 3 2 }
 */
