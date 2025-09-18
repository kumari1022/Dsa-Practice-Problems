
/*
    Problem Statement:
    Develop a Java program that demonstrates different ways of sorting 
    an Nested ArrayList of integers.
*/

import java.util.ArrayList;
import java.util.Collections;
public class NestedArrayListSort {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i =0;i<3;i++){
            al.add(new ArrayList<>());
        }
        al.get(0).add(20);
        al.get(0).add(10);
        al.get(1).add(40);
        al.get(1).add(30);
        al.get(2).add(60);
        al.get(2).add(50);
        System.out.println(al.toString());
        Collections.sort(al,(a,b)->a.get(0)-b.get(0));
        System.out.println(al.toString());
        Collections.sort(al,(a,b)->b.get(0)-a.get(0));
        System.out.println(al.toString());
    }
}
