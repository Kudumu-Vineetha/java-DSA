class First{
    int a=10,b=20;
    void sum(){
        System.out.println(a+b);
    }
}
class Second extends First{
    int c=30,d=40;
    void sub(){
        System.out.println(c-d);
    }
    void prod(){
        System.out.println(c*d);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Second s=new Second();
        s.sum();
        s.sub();
        s.prod();
    }
    
}
