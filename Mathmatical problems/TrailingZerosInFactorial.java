// Problem: Find the number of trailing zeros in the factorial of a given number n
import java.util.Scanner;

public class TrailingZerosInFactorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int count=0;

        // Count factors of 5 in n!
        for(int i=5;n/i>=1;i=i*5){
            count+=n/i;
        }

        System.out.println("Trailing zeros in "+n+"! is: "+count);
        sc.close();
    }
}
