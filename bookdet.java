//program to print book details
import java.util.*;
class book{
    String name;
    int quantity,code,i,n;
    float unitprice,total;
    book b[]= new book[10];
    Scanner sc= new Scanner(System.in);
    
    void read(){
        System.out.println("enter the number of books : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            b[i]= new book();
            System.out.println("enter the detail of "+(i+1)+"book");
            System.out.println("enter the name : ");
            b[i].name=sc.next();
            System.out.println("enter the code of the book ");
            b[i].code=sc.nextInt();
            System.out.println("enter the unit price ");
            b[i].unitprice=sc.nextFloat();
            System.out.println("enter the quantity ");
            b[i].quantity=sc.nextInt();
        }
       
    }

    void display(){
        System.out.println("details are: ");
        System.out.println("name\tcode\tunit price \t\tquantity \n");
        for(int i=0;i<n;i++){
            System.out.println(b[i].name+"\t"+b[i].code+"\t"+b[i].unitprice+"\t"+b[i].quantity);
        }
    }

    void total(){
        total=unitprice*quantity;
    }

    void totaldisplay(){
        System.out.println("details are: ");
        System.out.println("name\tcode\tunit price \t\tquantity\ttotal");
        for(int i=0;i<n;i++){
            System.out.println(b[i].name+"\t"+b[i].code+"\t"+b[i].unitprice+"\t"+b[i].quantity+"\t"+b[i].total);
        }
        
    }
}
public class bookdet{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        book B=new book();
        for(;;){
            System.out.println("1.read, display\n2.display total 3.exit");
            System.out.println("choose : ");
            int choice=sc.nextInt();
            switch(choice){
                case 1: B.read();
                        B.display();
                        break;
                case 2: B.totaldisplay();
                        break;
                case 3 : System.out.println("thank you!");
                        break;
                default: System.out.println("invalid choice 1");
                        break;

            }
        }
       
    }
}
