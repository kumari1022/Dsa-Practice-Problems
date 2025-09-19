/*
    Problem Statement:
    Develop a Java program to check whether a given integer is a perfect square.The program 
    should read an integer n from the user, test all numbers from 0 to n to see if any 
    squared value equals n, and print "yes" if it is a perfect square, otherwise print "No".
*/
import java.util.Scanner;
public class PerfectSquare1 {
    static String perfectSquare(int n){
        int i = 0;
        while(i<=n){
            if(i*i==n)
                return "yes";
            i++;
        }
        return "No";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = perfectSquare(n);
        System.out.println(res);
    }
}

