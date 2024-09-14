//import java.util.Arrays;
import java.util.Scanner;

public class avgCal{
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        //take input in array from user
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // print the value of array
        int totalScore = 0;
        for(int i = 0; i < n; i++){
            totalScore += arr[i];
        }
        
        double avg = totalScore/(double)n;
        System.out.println(avg);

        sc.close();
    }
}


