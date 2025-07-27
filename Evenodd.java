
import java.util.*;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
	int count=0;
	int even=0;
	int odd=0;
        while(temp>0)
        {
            int digit=temp%10;
            sum=sum*10+digit;
            temp=temp/10;
        }
        
      while (sum>0)
	{
	int d=sum%10;
	if(d%2==0)
	{
	 even=even*10+d;
    	}
	else
	{
	odd=odd*10+d;
	
	}
	sum=sum/10;
}
System.out.println(even);
System.out.println(odd);

System.out.println(even-odd);

}
}