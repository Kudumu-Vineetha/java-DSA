import java.util.*;
public class Arr13
	{
	public static void sort(int n,int a[])
	{
	for(int i=0;i<n;i++)
	{
	if(a[i]==0)
	{
		System.out.print("0 ");
	}
	}
	for(int i=0;i<n;i++)
	{
	if(a[i]!=0)
	{
		System.out.print(a[i]+" ");
	}
}	
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
sort(n,a);

}
}
