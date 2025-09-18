/*
    Problem Statement:
    Develop a Java program to check whether a given integer is a perfect square using the 
    binary search method.The program should search between 1 and n, square the middle value
    each time, and return "Yes" if a perfect square is found, otherwise "No".
*/
import java.util.Scanner;
public class PerfectSquare4{
    static String perfectSquare(int n){
        int l=1,h=n;
        while(l<=h){
            int mid = (l+h)/2;
            if(mid*mid==n)
                return "Yes";
            else if(mid*mid<n)
                l=mid+1;
            else
                h = mid-1;
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