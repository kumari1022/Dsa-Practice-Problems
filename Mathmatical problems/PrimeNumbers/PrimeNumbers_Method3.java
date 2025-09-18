/*
Problem Statement:
Write a Java program to check whether a given number is prime or not 
using the optimized 6k ± 1 method for efficiency.
*/

import java.util.Scanner;

public class PrimeNumbers_Method3{
    public static boolean isPrime(int n){
        if(n<=1) 
          return false;
        if(n==2||n==3)
           return true;
        if(n%2==0||n%3==0)
           return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        if(isPrime(number)) System.out.println(number+" is a Prime Number.");
        else System.out.println(number+" is not a Prime Number.");
    }
}
