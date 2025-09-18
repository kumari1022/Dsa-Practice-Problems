/*
    Problem Statement:
    You are given an Array of Integer.Develop a java program to find the no.of occurances of
    a target element in the array.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            if(al.get(i)==target)
                count++;
        }
        System.out.print("No.of repetitions of target : "+count);
    }
}
