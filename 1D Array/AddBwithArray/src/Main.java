import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //take input from user
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int B = sc.nextInt();
        for(int i = 0; i < n; i++){
            sum += B;
        }
        System.out.println("The total is :" + arr[i]);
    }
}