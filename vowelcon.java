import java.util.*;
public class vowelcon{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char[] input=s.toLowerCase().toCharArray();
            int vcount=0,concount=0;
            for(char ch:input)
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')   //if("aeiou".indexOf(ch)!=-1)
                {
                    vcount++;
                }
                else if(ch>='a'&& ch<='z')
                {
                    concount++;
                }
            }
            System.out.println("vowel count: "+vcount);
            System.out.println("consonent count: "+concount);
        }
}
