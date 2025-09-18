/*Create a LinkedList in Java, and traverse it both forward and backward using the ListIterator interface.*/
import java.util.*;
public class LinkedList_ListIterator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+":");
            linkedList.add(sc.nextInt());
        }
        ListIterator<Integer> it=linkedList.listIterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        sc.close();
    }
}
