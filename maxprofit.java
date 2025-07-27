import java.util.*;
public class maxprofit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        int low=a[0];
        int profit=0;
        for(int i=0;i<n;i++)
        {
            int temp=a[i]-low;
            profit=Math.max(profit,temp);
            low=Math.min(low,a[i]);               

        }
    System.out.print(profit);
    }
    
}
