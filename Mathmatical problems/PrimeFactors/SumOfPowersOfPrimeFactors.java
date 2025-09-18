/* Write a program to find the sum of powers of prime factors of a given number n.
   Example: 72 = 2³ × 3² → sum = 3 + 2 = 5.
*/ 
import java.util.*;
public class SumOfPowersOfPrimeFactors{
    public static int sumOfPowers(int n){
        int sum=0;
        int num=n; 
        for(int i=2;i<=num;i++){
            int count=0;
            while(n%i==0){
                count++;
                n/=i;
            }
            if(count>0){
                sum+=count;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Sum of powers of prime factors of "+n+": "+sumOfPowers(n));
        sc.close();
    }
}
