/*
    Problem Statement:
    Develop a Java program to determine whether a given integer is a perfect square using the
    square root method.The program should read an integer n, compute √n, and check if 
    squaring it again equals n. If true, print "yes", otherwise print "No".
*/

import java.util.Scanner;
public class PerfectSquare2 {
    static String perfectSquare(int n){
        double res = Math.sqrt(n);
        if(res*res==n)
            return "yes";
        return "No";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = perfectSquare(n);
        System.out.println(res);
    }
}
