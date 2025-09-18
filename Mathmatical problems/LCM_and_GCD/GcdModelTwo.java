/*
    Problem Statement:
    Develop a Java program to calculate the Greatest Common Divisor (GCD) of two integers 
    entered by the user using the subtraction-based Euclidean algorithm.
*/

import java.util.Scanner;
public class GcdModelTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }
    static int gcd(int a , int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
}
