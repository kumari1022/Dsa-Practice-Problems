/*Write a Java program to swap two numbers without using a third variable. Implement Method 5 using the formula:

b=(a+b)-(a=b);*/
import java.util.Scanner;

public class Swap5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a=sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b=sc.nextInt();

        System.out.println("\nOriginal values: a="+a+", b="+b);
        b=(a+b)-(a=b);
        System.out.println("Method 5: a="+a+", b="+b);
    }
}
