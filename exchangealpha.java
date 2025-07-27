import java.util.*;
public class exchangealpha{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String res="";
            //char[] input=s.toLowerCase().toCharArray();
            for(int i=0;i<s.length();i++){
                if(i%2==0)
                {
                    res+=Character.toLowerCase(s.charAt(i));
                }
                if(i%2!=0)
                {
                   res+=Character.toUpperCase(s.charAt(i)); 
                }
            }
            System.out.print(res);
        }
}