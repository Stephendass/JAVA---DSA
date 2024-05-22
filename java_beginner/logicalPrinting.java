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