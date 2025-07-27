import java.util.*;
public class print2d{
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
            for(int[] row:matrix)
                {
                    System.out.println(Arrays.toString(row));
                }
        
        }
}

