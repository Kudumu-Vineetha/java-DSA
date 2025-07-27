import java.util.*;
public class voweldiff{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char[] input=s.toLowerCase().toCharArray();
            int vcount=0,vcount1=0;
            for(int i=0;i<s.length()/2;i++)
            {
                if("aeiou".indexOf(input[i])!=-1)
                {
                    vcount++;
                }
            }
            for(int i=(s.length()/2)+1;i<s.length();i++){
                if("aeiou".indexOf(input[i])!=-1)
                {
                    vcount1++;
                }
            }
            System.out.println("vowel difference: "+Math.abs(vcount-vcount1));
        }
}
