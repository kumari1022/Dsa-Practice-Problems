/*
    Problem Statement:
    Develop a Java program to manage student records and sort them by Cgpa in descending
    order.Each student has roll number, name, branch, total marks, and CGPA.Use a custom 
    Comparator with Arrays.sort() to order the students and print the sorted list.
*/

import java.util.*;
class Student {
    int rollno;
    String name,branch;
    int total;
    double cgpa;
    Student(int rollno,String name,String branch,int total,double cgpa){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.total = total;
        this.cgpa = cgpa;
    }
    
    public String toString() {
        return "RollNo: " + rollno + ", Name: " + name + ", Branch: " + branch +
                ", Total: " + total + ", CGPA: " + cgpa;
    }
}
class SortByCgpa implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.cgpa==s2.cgpa)
            return 0;
        else if(s1.cgpa<s2.cgpa)
            return 1;
        return -1;
    }
}
public class CgpaDescOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i=0;i<n;i++){
            int rollno = sc.nextInt();
            String name = sc.next();
            String branch = sc.next();
            int total = sc.nextInt();
            double cgpa = sc.nextDouble();
            arr[i] = new Student(rollno,name,branch,total,cgpa);
            
        }
        Arrays.sort(arr,new SortByCgpa());
        for(Student st:arr){
            System.out.println(st);
        }
    }
}
