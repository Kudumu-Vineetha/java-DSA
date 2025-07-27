import java.util.*;
public class twod6{
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
            for(int i=rows-1;i>=0;i--)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print(matrix[i][j]+ " ");
                }
            System.out.println();
            }
        }
}

    
                    
                   
            

