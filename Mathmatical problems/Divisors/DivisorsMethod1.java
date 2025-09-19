/*
    Problem Statement:
    Write a Java program to print all the divisors of a given integer.The program should 
    read an integer n from the user and check every number from 1 to n, printing those that
    divide n exactly.
*/
import java.util.Scanner;
public class DivisorsMethod1 {
    static void divisors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisors1(n);
    }
}
