// Problem: Find and print all prime numbers up to n using a ListIterator
import java.util.*;
public class PrimeNumbers_ListIterator{
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
        ListIterator<Integer> lit=primes.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
        }
        sc.close();
    }
}

