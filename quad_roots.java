import java.util.*;
public class quad_roots {
    public static void main(String[]args){
        int a,b,c,d;
        double r1,r2;
        System.out.println("enter the coefficients of the quadratic equations");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    
        d=(b*b)-(4*a*c);
        if(a==0||b==0||c==0)
        {
            System.out.println("Invalid!!");
        }
        if(d<0){
              System.out.println(("the roots are imaginary"));
        }
        else if(d==0){
            r1=r2=((-b)/(2*a));
            System.out.println(("the roots are equal and they are r1="+r1+"and r2="+r2));
        }
        else{
             r1=((-b+Math.sqrt(d))/(2*a));
             r2=((-b-Math.sqrt(d))/(2*a));
            System.out.println(("the roots are real and distinct and are r1="+r1+"and r2="+r2));
        }
        

    }
}
