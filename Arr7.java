

import java.util.*;
public class Arr7 {
  public static boolean sameElements(int a[],int b[])
   {
   if(a.length!=b.length)
	{
		return false;
	}
  int freq[]=new int[10];
  for(int i=0;i<a.length;i++)
	{
		freq[i]++;
	}
  for(int i=0;i<b.length;i++)
	{
	       freq[i]--;
 
	}
	
  for(int i=0;i<freq.length;i++)
      {
      if(i!=0){
	return false;
	}
}
return true;
}



public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[m];
    	for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
	System.out.print(sameElements(a,b)?"same elements":"Different elements");
}
}