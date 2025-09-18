/*Create a LinkedList in Java, insert some elements, and display all the elements using a normal for loop with index.*/
import java.util.*;
public class LinkedListForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.print("Enter How many elements ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element"+(i+1)+":");
            int element = scanner.nextInt();
            linkedList.add(element);
        }
        System.out.println("\nElements in the LinkedList:");
        for (int i=0;i<linkedList.size();i++) {
            System.out.println("Element at index "+ i+":"+ linkedList.get(i));
        }
        scanner.close();
    }
}
