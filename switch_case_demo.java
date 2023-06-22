import java.util.*;
public class switch_case_demo {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println(("enter any number"));
        int button = sc.nextInt();
        switch(button)
        {
            case 1: System.out.println("hello!");
                    break;
            case 2: System.out.println("Namaste!");
                     break;
            case 3 : System.out.println("Bonjour!");
                     break;
            default : System.out.println("invalid number!");
                      break;
        }


    }
}
