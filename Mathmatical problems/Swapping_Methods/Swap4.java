/*
    Problem Statement:
    Develop a Java program to swap two integers without using a temporary variable by using the 
    bitwise XOR operator.The program should read two integers from the user, print them before 
    swapping, swap them inside a method, and print the swapped values.
*/
import java.util.Scanner;
public class Swap4 {
    static void swap4(int a , int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        swap4(a,b);
    }
}
