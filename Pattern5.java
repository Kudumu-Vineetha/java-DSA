import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
	
        for(int i=1;i<=5;i++)
        {
            
	for(int j=1;j<=i;j++)
            {
                 System.out.print("  ");
		
                
            }
	for(int j=i;j<=5;j++)
            {
                 System.out.print("* ");
		
                
            }
	System.out.println();
        }
       
    }
}

 * * * * *
   * * * *
     * * *
       * *
         *

decreaing: i to n (or) 1 to n-i
increasing:1 to i