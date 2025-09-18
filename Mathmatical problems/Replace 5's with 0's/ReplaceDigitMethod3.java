// Problem: Replace all 5's with 0's in the given number using character array
import java.util.Scanner;

public class ReplaceDigitMethod3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        String num=sc.next();
        char[] arr=num.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='5') arr[i]='0';
        }
        System.out.println("After replacing: "+new String(arr));
        sc.close();
    }
}

