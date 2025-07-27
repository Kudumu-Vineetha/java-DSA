
import java.util.*;
public class Factorialsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int start=sc.nextInt();
	int end=sc.nextInt();
	for(int i=start;i<=end;i++)
	{
	int sum=0;n=i;n=temp;
   while(n>0)
	
{

	int digit=n%10;
	int fact=1;
   	for(int num=1;num<=digit;num++)
		{
		 fact=fact*i;
		
		}
	sum=sum+fact;
	n=n/10;
}
if(sum==temp)
{
System.out.println(temp);

	
}
}
}
}
