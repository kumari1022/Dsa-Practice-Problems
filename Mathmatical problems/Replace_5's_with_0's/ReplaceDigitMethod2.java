// Problem: Replace all 5's with 0's in the given number using arithmetic, preserving leading zeros
import java.util.Scanner;

public class ReplaceDigitMethod2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        String num=sc.next();   
        StringBuilder result=new StringBuilder();

        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(ch=='5'){
                result.append('0'); 
            }else{
                result.append(ch);
            }
        }

        System.out.println("After replacing: "+result.toString());
        sc.close();
    }
}
