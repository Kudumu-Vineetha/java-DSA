import java.util.*;
public class Arr5 {
	public static boolean mirrorArr(int n,int arr[])
         {
		if(n%2==1)
  		{
			return false;
		}
		for(int i=0;i<n/2;i++)
		{
		if(arr[i]!=arr[n-1-i])
			{
			 return false;
			}
		}
	 return true;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	System.out.print(mirrorArr(n,arr));
}
}