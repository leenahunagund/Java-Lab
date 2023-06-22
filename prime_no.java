//to print prime no.s in a given range//
public class prime_no{
    public static void main(String[]args)
    {
        System.out.println("hi!");
     int low=10;
     int high=20;
     for(int j = low ;j<=high ;j++)
     {
        int f=0;
        for(int i=2;i<=(low/2);i++)
        {
            if(low%i==0)
            {
            f=1;
            break;
            }
            if (f==0)
            {
            System.out.println(j);
            break;
            }
           
        }
       
     }  
     System.out.println(("bye!"));
    
    }
}

