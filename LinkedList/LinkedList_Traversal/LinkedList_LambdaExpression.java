/*Create a LinkedList in Java, and traverse all elements using Java 8 lambda expression (forEach method).*/
import java.util.*;
public class LinkedList_LambdaExpression{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+":");
            linkedList.add(sc.nextInt());
        }
        linkedList.forEach((i)->System.out.print(i+" "));
        sc.close();
    }
}
