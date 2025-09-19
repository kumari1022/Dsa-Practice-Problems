// Problem: Replace all 5's with 0's in the given number using String replace()
import java.util.Scanner;

public class ReplaceDigitMethod1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        String num=sc.next();
        num=num.replace('5','0');
        System.out.println("After replacing: "+num);
        sc.close();
    }
}

