//program to print the fibonacci numbers//
class fibonacci
{
    public static void main(String[]args)
    {
        int n=5;
        int f1=0,f2=1;
        System.out.println("fibonacci series till "+n+"terms:");
        for (int i=0;i<=n;i++)
        {
            System.out.print(f1+" , ");
            int f=f1+f2;
            f1=f2;
            f2=f;
            
        }
    }
}


