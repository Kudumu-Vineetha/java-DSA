import java.util.*;
public class Arr9
	{
	public static void sort(int n,int a[])
	{
	for(int i=0;i<n/2;i++)
	{
	for(int j=i+1;j<n/2;j++)
	{
		if(a[i]<a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
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
System.out.print(Arrays.toString(a));
}
}



		