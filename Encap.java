class Student{
    private String name;
    private int rollno;
    private String branch;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setRollno(int r){
        rollno=r;
    }
    public int getRollno(){
        return rollno;
    }
    public void setBranch(String b){
        branch=b;
    }
    public String getBranch(){
        return branch;
    }
}

public class Encap {
    public static void main(String args[])
    {
        Student s=new Student();
        s.setName("Vineetha");
        s.setRollno(585);
        s.setBranch("cse");
        System.out.println(s.getName());
        System.out.println(s.getBranch());
        System.out.println(s.getRollno());
    }
    
}
