import java.util.*;
public class twod12{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int rows=sc.nextInt();
            int cols=sc.nextInt();
            int matrix[][]=new int[rows][cols];
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }
            int sum=0;
            for(int i=0;i<rows;i+=2)
            {
                    sum+=matrix[i][0]+matrix[i][rows-1];
            }
            System.out.print(sum);

        
        }
}

/*logic2:
if(j==0||j==n-1)


logic3:
if(j%2==0)*/
           