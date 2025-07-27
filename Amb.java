import java.util.*;
public class Amb
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<n1;i++)
			{
				if(n1%i==0)
				{
				sum1=sum1+i;
				}
			}
		for(int j=1;j<n2;j++)
			{
				if(n2%j==0)
				{
				sum2=sum2+j;
				}
			}
	if(sum1==n2 && sum2==n1)
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("no");
	}
}
}
		