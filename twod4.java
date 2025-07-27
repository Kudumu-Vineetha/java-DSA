import java.util.*;
public class twod4{
    public static void main(String ars[])
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
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(i==j || (i+j==rows-1))
                    {
                        if(matrix[i][j]<min)
                        {
                            min=matrix[i][j];
                        }
                    }
                    else
                    {
                        if(matrix[i][j]>max)
                        {
                            max=matrix[i][j];
                        }  
                    } 
                }
            }
            System.out.print(max-min);       
        }
}


