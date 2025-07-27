
public class Problem {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
   while(ch=='y' || ch=='Y')
   {
         int a=sc.nextInt();
         int b=sc.nextInt();
        System.out.println("sum:",(a+b));
      System.out.println("Do you want to continue(yes/no)");
      ch=sc.next().charAt(0);
    
    }
}
}