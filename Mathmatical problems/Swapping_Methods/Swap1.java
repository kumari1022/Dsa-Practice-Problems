/*
    Problem Statement:
    Develop a Java program to swap two integers using a temporary variable.The program should read
    two integers from the user, print them before swapping, perform the swap inside a method, and
    print the swapped values.
*/
import java.util.Scanner;
public class Swap1 {
    static void swap1(int a , int b){
        int c = a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        swap1(a,b);
    }
}
