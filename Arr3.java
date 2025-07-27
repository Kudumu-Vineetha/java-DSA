import java.util.*;
public class Arr3 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int evensum=0;
	int oddsum=0;
	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
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
}
	