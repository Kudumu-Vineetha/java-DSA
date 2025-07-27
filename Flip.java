import java.util.*;
public class Flip
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();		
		int temp1=n1,temp2=n2;
		int digit1=0,digit2=0,sum1=0,sum2=0;
		
		while(temp1>0)
			{
			digit1=temp1%10;
			sum1=sum1*10+digit1;
			temp1=temp1/10;
           		}
		while(temp2>0)
			{
			digit2=temp2%10;
			sum2=sum2*10+digit2;
			temp2=temp2/10;
           		}
  if(sum2>sum1)
	{
		System.out.println(sum2);
	}
else
	{
		System.out.println(sum1);
	}
}
}
	
			