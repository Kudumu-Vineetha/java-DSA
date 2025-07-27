class Constructor {
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println("name:" +name+"\nrollno:"+rollno+"\nmarks:"+marks);
    }
    Constructor(){
        name="vineetha";
        rollno=585;
        marks=18.85;
        System.out.println("hello");
    }
}
public class Main{
    public static void main(String args[])
    {
        Constructor c=new Constructor();
        c.display();
    }
}
