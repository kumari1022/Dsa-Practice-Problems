/*Write a program that finds all prime factors of a given number n and stores them in an ArrayList, then return the ArrayList. */
import java.util.ArrayList;
import java.util.Scanner;
public class PrimeFactorsArrayList {
    public static ArrayList<Integer> getPrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        ArrayList<Integer> result = getPrimeFactors(n); 
        System.out.println("Prime factors of " + n + ": " + result);
        sc.close();
    }
}
