//program to print student details
import java.util.*;
import java.util.Scanner;
class stud{
       int rollnum;

    void readnum(int n){
            rollnum=n;
       }
    void printnum(){
        System.out.println("roll number : "+rollnum);
    }
}
class test extends stud{
    int sub1,sub2;
    void readmarks(int m1,int m2){
        sub1=m1;
        sub2=m2;
    }
    void printm(){
        System.out.println("marks in subject 1 : "+sub1);
        System.out.println("marks in subject 2 : "+sub2);
    }

}
interface sports{
    void readwt(double n);
    void printwt();
}

class results extends test implements sports{
    double total,sportwt;
    public void readwt(double n ){
        sportwt=n;
    }
    public void printwt(){
        System.out.println("sports weightage : "+sportwt);
    }
    void display(){
        total=sub1+sub2+sportwt;
    printnum();
    printm();
    printwt();
    System.out.println("total is : "+total);
    }
}
public class studentdet{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students : ");
        int n =sc.nextInt();
        results[] s = new results[n];
        for(int i =0;i<n;i++){
            s[i]=new results();
            System.out.println("\nenter details of student"+(i+1)+" : ");
            System.out.println("roll number : ");
            s[i].readnum(sc.nextInt());
            System.out.println("enter the marks of 1 subject : ");
            int m1=sc.nextInt();
            System.out.println("enter the marks of 2 subject : ");
            int m2=sc.nextInt();
            s[i].readmarks(m1,m2);
            System.out.println("enter the sports weightage: ");
            s[i].readwt(sc.nextDouble());
        }
        for(int i=0;i<n;i++){
            System.out.println("details of student : "+(i+1)+": ");
            s[i].display();
            
        }


    }
}



