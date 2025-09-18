/*
    Problem Statement:
    You are given an Array of integer . Develop a java program to remove all the even 
    numbers from the ArrayList.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class RemoveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        System.out.println("Before deleting Evens: ");
        for(int i : al){
            System.out.print(i+" ");
        }
        System.out.println();
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        System.out.println("After deleting Evens: ");
        for(int i : al){
            System.out.print(i+" ");
        }
    }
}
