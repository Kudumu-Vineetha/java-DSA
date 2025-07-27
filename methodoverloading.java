public class methodoverloading {
    public static int Add(int a,int b)
    {
       return a+b; 
    }
    

public static void main(String args[])
{
    methodoverloading a=new methodoverloading();
    System.out.println(Add(5,10));
}
}
