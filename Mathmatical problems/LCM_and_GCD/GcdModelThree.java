/*
    Problem Statement:
    Develop a Java program to find the Greatest Common Divisor (GCD) of two
    integers entered by the user using the brute-force method.
*/

import java.util.Scanner;
public class GcdModelThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }
    static int gcd(int a , int b){
        int num = Math.min(a,b);
        int res = 0;
        for(int i=num;i>=1;i--){
            if(a%i==0 && b%i==0){
                res = i;
                break;
            }
        }
        return res;
    }
}
