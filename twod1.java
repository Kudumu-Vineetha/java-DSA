import java.util.*;
public class twod1{
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
            int secdia=0;
            int firdia=0;
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(i==j)
                    {
                        firdia+=matrix[i][j];
                    }
                    if((i+j)==rows-1)
                    {
                        secdia+=matrix[i][j];
                    }
                }
            }
            System.out.print(secdia-firdia);       
        }
}

