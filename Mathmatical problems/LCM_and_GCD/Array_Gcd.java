import java.util.*;
class Array_Gcd{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int gcd = arr[0];
        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, arr[i]);
        }

        System.out.println("GCD of the array is: " + gcd);


    }
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}