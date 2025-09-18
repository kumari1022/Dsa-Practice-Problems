/*
    Problem Statement:
    Develop a Java program that demonstrates different ways of sorting 
    an Array of integers.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ArraysSorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer arr1[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, (a,b)->a-b);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, (a,b)->b-a);
        System.out.println(Arrays.toString(arr1));

    }
}
