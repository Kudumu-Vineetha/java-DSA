class First{
    int a,b;
    First(int x,int y){
        System.out.println("First class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
}
class Second extends First{
    Second(){
        super(10,20);
        System.out.println("Second class constructor");
    }
}
public class Super {
    public static void main(String args[]){
        Second s=new Second();
        s.sum();
    }
    
}

