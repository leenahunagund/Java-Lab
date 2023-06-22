//program to implement stack
import java.util.*;
import java.lang.Exception;
import java.lang.System;
class StackException extends Exception{
    StackException(String str){
        super(str);
    }
    
}
class Stack{
    private final int[] stk;
    private int tos;

    Stack(int size){
        stk=new int[size];
        tos=-1;
    }

    void push(int item) throws StackException{
        if(tos==stk.length-1){
            throw new StackException("stack overflow ");

        }
        else
        stk[++tos]=item;
    }
    int pop() throws StackException{
        if(tos<0){
            throw new StackException("stack underflow");

        }
        else
        return stk[tos--];

    }
    void display(){
        if(tos>-1){
            System.out.println("stack elements are : ");
            for(int i=tos;i>-1;i--)
            System.out.println(stk[i]+" ");
        }
        else
        System.out.println("stack underflow");
    } 
    void peek(){
        if(tos==-1)
        System.out.println("stack underflow");
        else
        System.out.println("peek element is : "+stl[tos]);
    }  

}
public class stack{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the stack size ");
        int size = sc.nextInt();
        Stack stkObj= new Stack(size);
        int ch;
        for(;;){
            System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
            ch=sc.nextInt();
            switch(ch){
                case 1 : 
                try{
                    System.out.println("enter the element ");
                    stkObj.push(sc.nextInt());
                }catch(StackException e ){
                    System.err.println("Exception caught"+e);
                }
                break;
                case 2 : 
                    try{
                        System.out.println("popped element is : "+stkObj.pop());
                    }catch(StackException e){
                        System.err.println("Exception caight " + e);
                    }
                break;
                case 3: 
                stkObj.peek();
                break;
                case 4 : 
                stkObj.display();
                case 0 : break;
                default : System.out.println("invalid choice ");

            }
        }
    }
}