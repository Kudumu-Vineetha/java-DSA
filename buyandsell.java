import java.util.*;
public class buyandsell {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
        int min=a[0];
        int profit=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)               
            {
                min=a[i];
            }
            else if((a[i]-min)>profit)
            {
                profit=a[i]-min;
            }

        }
    System.out.print(profit);
    }
    
}
