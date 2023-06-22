//program to show student marks
import java.util.*;
class student{
 String name;
 int m[] = new int[3];
 int i,N,rollnum,total,high1,high2,high3,hight;
 student s[]=new student[2];

 void read(){
    System.out.println("enter the number of students : ");
    Scanner sc= new Scanner(System.in);
    N=sc.nextInt();
    for(i=0;i<N;i++){
        s[i]=new student();
        System.out.println("enter the name of student : " );
        s[i].name=sc.next();
        System.out.println("enter the roll number:  ");
        s[i].rollnum=sc.nextInt();
        System.out.println("enter the 3 subject marks :\n ");
        s[i].m[0]=sc.nextInt();
        s[i].m[1]=sc.nextInt();
        s[i].m[2]=sc.nextInt();
    }
 }
 void display(){
    for(i=0;i<N;i++){
        System.out.println("the student details are : ");
        System.out.println(s[i].name+"\t"+s[i].rollnum+"\t"+s[i].m[0]+"\t"+s[i].m[1]+"\t"+s[i].m[2]);
    }
}

void total(){
   total=m[0]+m[1]+m[2];
}

void totaldisplay(){
    for(i=0;i<N;i++){
        s[i].total();
        System.out.println(s[i].name+"\t"+s[i].rollnum+"\t"+s[i].m[0]+"\t"+s[i].m[1]+"\t"+s[i].m[2]+"\t"+s[i].total);
    }
}

void subhigh(int j){
    int sh=0;
    high1=s[0].m[j];
    for(int i=1;i<N;i++){
        if(s[i].m[j]>high1){
            high1=s[i].m[j];
            sh=i;
        }
    }
    System.out.println("the student with highest marks in subject "+(j+1)+"is :"+s[sh].name);
}

void hightotal(){
    int ht=0;
    hight=s[0].total;
    for(int i=1;i<N;i++){
        if(s[i].total>hight){
            hight=s[i].total;
            ht=i;
        }
    }
    System.out.println("the student with the highest marks in total is : "+s[ht].name);
}
}

public class p7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice;
        student st=new student();
        System.out.println("1.read , display\n2.total marks , display \n3.highest marks, display");
        System.out.println("choose : ");
        choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("enter the details of "+st.N+"student ");
                    st.read();
                    System.out.println("the entered details are : \n name\troll number\tmarks1\tmarks2\tmarks3");
                    st.display();
                    break;
            case 2:  System.out.println("the entered details are : \n name\troll number\tmarks1\tmarks2\tmarks3\ttotal");
                    st.totaldisplay();
                    break;
            case 3: st.subhigh(0);
                    st.subhigh(1);
                    st.subhigh(2);
                    break;
            case 4 : st.hightotal();
                    break;

        }
    }

}









