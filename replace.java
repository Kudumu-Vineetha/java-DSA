import java.util.*;
public class replace{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            //String result="";
            //char[] input=s.toLowerCase().toCharArray();
            for(int ch=0;ch<s.length();ch++)
            {
                if("aeiou".indexOf(s.charAt(ch))!=-1)
                {
                    s=s.replace(s.charAt(ch),'@');
                }
            }
            System.out.println("replaced vowels by @: "+s);
        }
}
