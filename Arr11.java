import java.util.*;
public class Arr11
	{
	public static int[] binary(int n,int a[])
	{
	int temp[]=new int[5];
	for(int i=0;i<n;i++)
	{
        temp[i]=a[i]%2;     //or a[i]%=2;
	}
return temp;
	
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
int result[]=binary(n,a);
System.out.print(Arrays.toString(result)); //or a;
}
}



5
1 2 3 4 5
[1, 0, 1, 0, 1]		