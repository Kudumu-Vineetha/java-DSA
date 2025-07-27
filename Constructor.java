public class Constructor {
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println("name:" +name+"\nrollno:"+rollno+"\nmarks:"+marks);
    }
    Constructor(String n,int r,double m){
        name=n;
        rollno=r;
        marks=m;
        System.out.println("hello");
    }
public static void main(String args[])
    {
        Constructor c=new Constructor("vineetha",585,18.85);
        c.display();
    }
}


