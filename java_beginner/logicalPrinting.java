package java_beginner;
import java.util.*;

public class logicalPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Number1 is :" + n1);
        System.out.println("Number2 is :" + n2);
        System.out.println("Number3 is :" + n3);
        System.out.println("(n1 < n2) condition is " +(n1 < n2));
        System.out.println("(n2 == n3) condition is " +(n2 == n3));
        System.out.println("(n1 < n2) && (n2 == n3) condition is " +((n1 < n2) && (n2 == n3)));
        sc.close();
    }
}
/* 
problem
Take three numbers from the user, i.e. n1, n2 and n3.
The First line is an integer, n1
The Second line is an integer, n2
The Third line is an integer, n3


Output Format
Print the statement with Boolean results.*/