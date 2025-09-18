/*
    Problem Statement:
    Develop a java program to traverse the ArrayList using ListIterator.
*/
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        ListIterator<Integer> it = al.listIterator();
        while(it.hasNext()){
            int num = it.next();
            System.out.print(num+" ");
        }
    }
}

