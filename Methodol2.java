public class Methodol2 {
    public static int display(int a,int b)
    {
        return a+b;
    } 
    public static float display(float a,float b)
    {
        return a+b;
    }
    public static double display(double a,double b)
    {
        return a+b;
    }  
public static void main(String args[])
{
    Methodol2 m=new Methodol2();
    System.out.println(m.display(1,2));
    System.out.println(m.display(3f,4f));
    System.out.println(m.display(5,6));
}
    
}
