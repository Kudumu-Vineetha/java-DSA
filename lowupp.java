import java.util.*;
public class lowupp{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String res="";
            //char[] input=s.toLowerCase().toCharArray();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch==Character.toUpperCase(ch))
                {
                    res+=Character.toLowerCase(ch);
                }
                if(ch==Character.toLowerCase(ch))
                {
                   res+=Character.toUpperCase(ch); 
                }
            }
            System.out.print(res);
        }
}