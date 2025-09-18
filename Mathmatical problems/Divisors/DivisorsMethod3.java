/*
    Problem Statement:
    Develop a Java program to find all the divisors of a given integer using an optimized
    method.The program should iterate from 1 to √n, print each divisor, and also print its
    corresponding pair (n/i) if it is different.
*/
import java.util.Scanner;
public class DivisorsMethod3 {
    static void divisors3(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i)
                    System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisors3(n);
    }
}
