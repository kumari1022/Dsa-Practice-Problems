/*
    Problem Statement:
    Develop a Java program to manage student records and allow sorting by different attributes.Each student has 
    rollno, name, branch, total, and cgpa.Implement separate Comparator classes to sort students by roll number,
    name,branch,total marks,and CGPA.In the main program, read student details into an ArrayList, sort them using
    one of the comparators (e.g., by roll number), and print the sorted list.
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
class SortByRollNo implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.rollno==s2.rollno)
            return 0;
        else if(s1.rollno>s2.rollno)
            return 1;
        return -1;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.name.compareTo(s2.name)==0)
            return 0;
        else if(s1.name.compareTo(s2.name)>0)
            return 1;
        return -1;
    }
}
class SortByBranch implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.branch.compareTo(s2.branch)==0)
            return 0;
        else if(s1.branch.compareTo(s2.branch)>0)
            return 1;
        return -1;
    }
}
class SortByTotal implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.total==s2.total)
            return 0;
        else if(s1.total>s2.total)
            return 1;
        return -1;
    }
}
class SortByCgpa implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.cgpa==s2.cgpa)
            return 0;
        else if(s1.cgpa>s2.cgpa)
            return 1;
        return -1;
    }
}
public class CustomSortDescendingOrder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int rollno = sc.nextInt();
            String name = sc.next();
            String branch = sc.next();
            int total = sc.nextInt();
            double cgpa = sc.nextDouble();
            Student s1 = new Student(rollno,name,branch,total,cgpa);
            al.add(s1);
        }
        Collections.sort(al,new SortByRollNo());
        for(Student st:al){
            System.out.println(st);
        }
    }
}