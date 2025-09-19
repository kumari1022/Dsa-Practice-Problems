/*
Problem Statement:
Write a Java program to check whether a given number is prime or not 
by checking divisibility up to √n (most common method).
*/

import java.util.Scanner;

public class PrimeNumbers_Method4{
    public static boolean isPrime(int n){
        if(n<=1)
           return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) 
               return false;
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
