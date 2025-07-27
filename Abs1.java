abstract class First{
    abstract void sum(int a,int b);
    abstract void mul(int a,int b);
}
abstract class Second extends First{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    abstract void mul(int a,int b);
}
class Third extends Second{
    void mul(int a,int b){
        System.out.println(a*b);
    }
}
public class Abs1 {
    public static void main(String args[]){
        Third ob=new Third();
        ob.sum(10,20);
        ob.mul(30,40);
    }
    
}
