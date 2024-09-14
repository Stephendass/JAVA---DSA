import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //take input from User
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int prod = 1;
        for(int i = 0; i < n; i++){
            prod *= arr[i];
        }

        System.out.println("The Product of the array is " + prod);
    }
}