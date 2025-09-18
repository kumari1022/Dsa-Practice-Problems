/*
    Problem Statement:
    Write a Java program to compute the Least Common Multiple (LCM) of two integers entered
    by the user.The program should first find the Greatest Common Divisor (GCD) using the 
    subtraction-based Euclidean algorithm, then calculate LCM using the formula: LCM * GCD is 
    equals to product of two numbers.
*/

import java.util.Scanner;
public class LcmModelOne {
    static int lcm(int a,int b){
        int res = gcd(a,b);
        return (a*b)/res;
    }
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = lcm(a,b);
        System.out.println(res);
    }
}
