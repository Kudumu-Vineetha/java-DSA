interface First 
{
    abstract void display();
    abstract void print();
}
class Second implements First{
    public void display(){
        System.out.println("First method");
    }
    public void print(){
        System.out.println("Second method");
    }
}
public class Interface {
    public static void main(String args[]){
        Second ob=new Second();
        ob.display();
        ob.print();
    }
    
}
