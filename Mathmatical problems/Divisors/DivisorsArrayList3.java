/*
    Problem Statement:
    Develop a Java program to find all the divisors of a given integer using an optimized
    method.The program should iterate from 1 to √n, store each divisor, and also store its
    corresponding pair (n/i) if it is different.Then return and print all the divisors.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class DivisorsArrayList3 {
    static ArrayList<Integer> divisors3(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                al.add(i);
                if(n/i!=i)
                    al.add(n/i);
            }
        }
        return al;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res3 = divisors3(n);
        System.out.println(res3.toString());
    }
}
