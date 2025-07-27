public class Oops {
    String name;
    int rollno;
    double marks;
    void display()
    {
        System.out.println(name+" "+rollno+" "+marks);
    }
public static void main(String args[]){
    Oops o=new Oops();
    o.name="vineetha";
    o.rollno=585;
    o.marks=18.85;
    o.display();

    }
}

