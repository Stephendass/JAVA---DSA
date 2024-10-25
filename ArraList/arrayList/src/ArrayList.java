import java.util.*;

public class ArrayList {
    public static void demo1AL(){
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<>(); - Syntax of Arraylist
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); //print ArrayList
        list.add(2023);            //add integer in last index
        System.out.println(list);
        System.out.println(list.size()); //print the size of index
        System.out.println(list);
        System.out.println(list.get(3)); //print the ith index in the array
        //Print the arraylist using loop
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.set(0, 50); // update the ith index value in arraylist
        System.out.println(list);
        list.remove(3); //remove the ith index in arraylist
        System.out.println(list);
        list.remove(list.size()-1); //remove the last index in an arraylist
        System.out.println(list);
        list.add(2, 10); // adding the element using index in arraylist
        System.out.println(list);

    }
    public static void main(String[] args) {
        demo1AL();
    }

}