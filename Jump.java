import java.util.*;
public class Jump
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prev=n%10;
		n=n/10;
		boolean flag=true;
		while(n>0)
		{
		int next=n%10;
		if(Math.abs(next-prev)!=1)
			{
				flag=false;
				break;
			}
		prev=next;
		n=n/10;
		}
	if(flag)
		System.out.println("Jumping number");
	else
		System.out.println("Not a Jumping number");
}
}
		