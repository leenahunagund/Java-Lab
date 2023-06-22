//program to print employee details-3
import java.util.*;
class emp{
    String name,dept;
    int id,i,n;
    float basicpay,netpay,grosspay,tax;
    emp e[]=new emp[10];
    Scanner sc= new Scanner(System.in);
     
    void read(){
        System.out.println("enter the number of employees : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            e[i]=new emp();
            System.out.println("enter the details of "+(i+1)+" employee : ");
            System.out.println("enter name : ");
            e[i].name=sc.next();
            System.out.println("enter employee id : ");
            e[i].id=sc.nextInt();
            System.out.println("enter basic salary : ");
            e[i].basicpay=sc.nextFloat();
        }
    }
    void display(){
        System.out.println("details are :\nname\tid\tsalary\n");
        for(i=0;i<n;i++){
            System.out.println(e[i].name+"\t"+e[i].id+"\t"+e[i].basicpay);
        }
    }
    void grosspaycalc(){
        grosspay=basicpay+(.58F*basicpay)+(.16F*basicpay);
    }
    void taxcalc(){
        if(grosspay<200000){
            tax=0;
        }
        else if((grosspay>200000)&&(grosspay<300000)){
            tax=.10F*grosspay;
        }
        else if((grosspay>300000)&&(grosspay<500000)){
            tax=.15F*grosspay;
        }
        else{
            tax=.30F*grosspay;
            tax=tax+.2F*tax;
        }
    }
    void netpaycalc(){
        netpay=grosspay-tax;
    }

    void totaldisplay(){
        System.out.println("details are :\nname\tid\tsalary\nnetpay");
        for(i=0;i<n;i++){
            e[i].netpaycalc();
            System.out.println(e[i].name+"\t"+e[i].id+"\t"+e[i].basicpay+"\t"+e[i].netpay);
        }
    }
}
public class employee{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice;
        emp E =new emp();
        for(;;){
            System.out.println("1.read , display\n2.display total\n");
            System.out.println("choose : ");
            choice=sc.nextInt();
            switch(choice){
                case 1 : E.read();
                        E.display();
                        break;
                case 2 : E.totaldisplay();
                        break;
                default : System.out.println("invalid choice! ");
                        break;
            }
        }
        

    }
}