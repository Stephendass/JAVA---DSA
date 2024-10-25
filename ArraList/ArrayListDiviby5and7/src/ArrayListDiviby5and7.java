import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDiviby5and7{
    public static void problems1DAL(ArrayList<Integer> list){
        System.out.println(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            int val = list.get(i);
            if(val % 5 == 0 && val % 7 ==0){
                ans.add(val);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int val = scn.nextInt();
            list.add(val);
        }
        problems1DAL(list);
    }

}