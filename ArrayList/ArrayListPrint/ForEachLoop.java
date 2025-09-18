/*
    Problem Statement:
    Develop a java program to traverse the ArrayList using for each loop.
*/
import java.util.*;
class ForEachLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        for(int i : al){
            System.out.print(i+" ");
        }
    }
}