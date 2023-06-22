//program to print a pyramid pattern//
import java.util.*;
public class pyramid{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        //int st=1;
        //int sp=1;
        for (int i =0;i<=n;i++)//for rows
        {
            for (int j=0;j<i;j++)//for columns
            {
                System.out.print("* ");
            }
            System.out.println();
           // st+=2;
            //sp--;
        }
    }
}