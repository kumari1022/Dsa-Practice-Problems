/*
    Problem Statement:
    Develop a Java program to compute the Greatest Common Divisor (GCD) 
    of two integers using the Euclidean algorithm.
*/
import java.util.Scanner;
class GcdModelOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a,b);
        System.out.println(res);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}