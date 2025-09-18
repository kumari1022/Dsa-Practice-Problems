/*Create a LinkedList in Java, insert elements, and display them using a for-each loop.*/
import java.util.*;
public class LinkedListForEachLoop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+":");
            linkedList.add(sc.nextInt());
        }
        for(Integer i:linkedList){
            System.out.println("i:"+i);
        }
        sc.close();
    }
}
