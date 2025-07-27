abstract class First{
    int a,b;
    First(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
    abstract void sub();
    abstract void mul();
}
class Second extends First{
        Second(){
            super(10,20);
        }
        void sub(){
            System.out.println(a-b);
        }
        void mul(){
            System.out.println(a*b);
        }
   
    }

public class Abstraction {
    public static void main(String args[]){
        Second ob=new Second();
        ob.sum();
        ob.sub();
        ob.mul();
    }
    
}
