/*
    Problem Statement:
    Develop a java program to traverse the ArrayList using LamdaExpression.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class LambdaTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        al.forEach(elem->System.out.print(elem+" "));
    }
}



