import java.util.*;
public class p1 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number:\n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){  //for rows
           for(int j=1;j<=i;j++){
              System.out.print(i);
           }
           System.out.println();
        }
    }
    
}
