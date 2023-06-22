//program to implement bank class using abstract class
import java.util.*;
abstract class bank{
    char banktype;
    double amnt , interest;
    boolean platinumcard , offercreditcard;

    abstract void getroi();
 
    void deposit(){
        banktype = 'v';
        amnt=0;
        interest=0;
        platinumcard=false;

    }

}
class bankdetails extends bank{
    Scanner sc= new Scanner(System.in);
    double termdeposit=0;
    int term=0;

    void getroi(){
        if(banktype=='n'){
            platinumcard=false;
            if(term>=3)
            interest=.07*termdeposit;
        }
        else{
            platinumcard=true;
            if(term>=3)
            interest=0.08*termdeposit;
        }
    }


void deposit(){
    System.out.println("enter the type of bank : ");
    banktype=sc.next().charAt(0);
    if(banktype=='n'||banktype=='i'){
        System.out.println("enter the amount to be deposited : ");
        termdeposit=sc.nextInt();
        System.out.println("enter the term for which it has to be deposited: ");
        term=sc.nextInt();
        getroi();
    }
    else
    System.out.println("invalid bank type !");

}

void display(){
    String bankn;
    if(banktype=='n')
    bankn="nationalised bank";
    else if (banktype=='i')
    bankn="international bank";
    else
    bankn="invalid bank";

    System.out.println("type of bank : "+bankn);
    System.out.println("interest is: " +interest );
    if(platinumcard){
        System.out.println("eligble for platinum card ");
    }
    else
    System.out.println("not eligible for platinum card");
}
}
public class bankdet{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of banks : ");
        int n = sc.nextInt();
        bankdetails b[]= new bankdetails[n];
        for(int i=0;i<n;i++){
            b[i]= new bankdetails();
            System.out.println("enter the details of bank :  "+(i+1));
            b[i].deposit();
        }
        for(int i=0;i<n;i++){
            System.out.println("the details of bank : "+(i+1)+"are : ");
            b[i].display();
            
        }
    }
}