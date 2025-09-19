/*
    Problem Statement:
    Write a Java program to print all the divisors of a given integer.The program should 
    read an integer n from the user and check every number from 1 to n/2, store numbers 
    those that divide n exactly and print them.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class DivisorsArrayList2{

    static ArrayList<Integer> divisors2(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                al.add(i);
        }
        al.add(n);
        return al;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res2 = divisors2(n);
        System.out.println(res2.toString());
    }
}
