import java.util.*;
public class toeplitz{
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
            boolean flag=true;
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(matrix[i][j]!=matrix[rows-1][cols-1])
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==true){
                System.out.print("true");
            }
            else{
                System.out.print("false");
            }

        }
}
           