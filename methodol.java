public class methodol {
    public static int Add(int a,int b)
    {
       return a+b; 
    }
    public static float Add(float a,float b,float c)
    {
        return a+b+c;
    }
    

public static void main(String args[])
{
    //methodoverloading a=new methodoverloading();
    System.out.println(Add(5,10));
    System.out.println(Add(5,10,20));
}
}
