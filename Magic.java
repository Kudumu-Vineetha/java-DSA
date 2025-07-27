import java.util.*;
public class Magic
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,sum1=0;
		int digit=0,digit1=0;
		while(n>0)
		{
		digit=n%10;
		sum=sum+digit;
		n=n/10;
		}
	System.out.println(sum);
		while(sum>0)
		{
		digit1=sum%10;
		sum1=sum1+digit1;
		sum=sum/10;
		}
	System.out.println(sum1);
	
 if(sum1==1)
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
}
}