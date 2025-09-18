// Problem: Find and print all prime numbers up to n using a Lambda expression
import java.util.*;
public class PrimeNumbers_LambdaExpression{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
        }
        primes.forEach((p)->System.out.print(p+" "));
        sc.close();
    }
}

