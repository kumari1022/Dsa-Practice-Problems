/*
Problem Statement:
Write a Java program to check whether a given number is prime or not 
by counting divisors up to n/2.
*/

import java.util.Scanner;

public class PrimeNumbers_Method2{
    public static boolean isPrime(int n){
        int c=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) c++;
        }
        return c==1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        if(isPrime(number)) System.out.println(number+" is a Prime Number.");
        else System.out.println(number+" is not a Prime Number.");
    }
}
