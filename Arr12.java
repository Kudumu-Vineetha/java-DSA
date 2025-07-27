import java.util.*;
public class Arr12
	{
	    public static void sort(int n,int a[]){
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                if(a[i]==0){
		                int temp=a[i];
		                a[i]=a[j];
		                a[j]=temp;
	                }
                }               	
            }
        }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
         System.out.print("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        }
        sort(n,a);
         System.out.println("Array after moving zeros to the end:");
        System.out.print(Arrays.toString(a));
    }
}
