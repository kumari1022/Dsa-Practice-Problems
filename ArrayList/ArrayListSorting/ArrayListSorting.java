
/*
    Problem Statement:
    Develop a Java program that demonstrates different ways of sorting 
    an ArrayList of integers.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ArrayListSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int var = sc.nextInt();
            al.add(var);
        }
        System.out.println(al.toString());
        Collections.sort(al);
        System.out.println(al.toString());
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al.toString());
        Collections.sort(al);
        System.out.println(al.toString());
        Collections.sort(al,Comparator.reverseOrder());
        System.out.println(al.toString());
        Collections.sort(al,(a,b)->a-b);
        System.out.println(al.toString());
        Collections.sort(al,(a,b)->b-a);
        System.out.println(al.toString());
    }
}
