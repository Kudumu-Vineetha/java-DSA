import java.util.*;
public class twod14{
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
                    if((i==j) || (i+j==rows-1))
                    {
                        if(matrix[i][j]==0)
                        {
                        flag=false;
                        break;
                        }
                    }
                    else{
                        if(matrix[i][j]!=0)
                        {
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if(flag==true){
                System.out.print("X matrix");
            }
            else{
                System.out.print("not a X matrix");
            }

        }
}
           