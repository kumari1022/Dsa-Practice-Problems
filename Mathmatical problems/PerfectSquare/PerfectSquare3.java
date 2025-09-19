/*
    Problem Statement:
    Develop a Java program to check whether a given integer is a perfect square by comparing
    the floor and ceiling values of its square root.If both are equal, print "yes", 
    otherwise print "No".
*/

import java.util.Scanner;
public class PerfectSquare3{
    static String perfectSquare(int n){
        double res = Math.sqrt(n);
        if(Math.floor(res)==Math.ceil(res))
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