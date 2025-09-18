/*
    Problem Statement:
    Write a Java program to find the Least Common Multiple (LCM) of two integers entered 
    by the user using the brute-force method.
*/
import java.util.Scanner;
public class LcmModelTwo {
    static int lcm(int a , int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        int res = 0;
        for(int i=x;i<=a*b;i=i+x){
            if(i%y==0){
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = lcm(a,b);
        System.out.println(res);
    }
}
