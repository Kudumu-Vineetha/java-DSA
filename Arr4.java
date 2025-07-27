import java.util.*;
public class Arr4 {
  public static void eSum_oSum(int n,int arr[])
  {
	int evensum=0;
	int oddsum=0;
        for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+arr[i];
			}
			
			else
			{
				oddsum=oddsum+arr[i];
			}
	
	
		}
			System.out.print(Math.abs(evensum-oddsum));
}





    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	eSum_oSum(n,arr);
}
}
	