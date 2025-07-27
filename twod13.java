import java.util.*;
public class twod13{
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
        
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(matrix[i][j]==1)
                    {
                        matrix[i][j]=0;
                    }
                    
                    else if (matrix[i][j]==0)
                    {
                        matrix[i][j]=1;
                    }
                }
            }
         for(int i=0;i<rows;i++)
            {
                for(int j=cols-1;j>=0;j--)
                {
                    System.out.print(matrix[i][j]+ " ");
                }
            System.out.println();
            }
        }
}
           








/* reverse loop for j
 * s.o.p(matrix[i][j]^1)
 */