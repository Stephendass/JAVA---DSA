package java_beginner;
import java.util.*;

public class addAndDivi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int addNum = n1 + n2;
        System.out.println(addNum % 3);
        sc.close();
    }
}

/* Problem:
 *Add two numbers and divide them by a third number and print the remainder".
 */
