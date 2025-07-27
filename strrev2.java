import java.util.*;
public class strrev2{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char[] input=s.toCharArray();
            int left=0,right=s.length()-1;
            while(left<=right)
                {
                    char temp=input[left];
                    input[left]=input[right];
                    input[right]=temp;
                    left++;
                    right--;
                }
                String result=new String(input);  // rev string just print result
                if(result.equals(s))
                {
                    System.out.print("palindrome");
                }
                else
                {
                    System.out.print("not a palindrome");
                }
        }
}