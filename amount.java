import java.util.*;
public class Hello
{
 public static void main()
  {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   if((n<=0)||(n%100!=0))
     {
     System.out.println("Invalid amount");
     }
   else
    {
     if(n>=500)
      {
        int f=n/500;
        n=n%500;
        System.out.println("500 notes are:",f);
      ]
