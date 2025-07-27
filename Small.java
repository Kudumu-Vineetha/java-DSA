import java.util.*;

public class Small{
public static void min(int a[])
{
 int min=a[0];
for(int i=0;i<n;i++)
{
 if(min>a[i])
{
       min=a[i];
}
}
System.out.println(min);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
}
Small p=new Small();
p.min(a);

}

}

