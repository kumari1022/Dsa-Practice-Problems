/*
Problem Statement:
Write a Java program to check whether a given number is prime or not 
by counting all divisors (brute force approach).
*/

import java.util.Scanner;

public class PrimeNumbers_Method5{
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        return count==2;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        if(isPrime(number)) System.out.println(number+" is a Prime Number.");
        else System.out.println(number+" is not a Prime Number.");
    }
}
