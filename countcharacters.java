import java.util.*;

public class countcharacters{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String res="";
        for(int i=0;i<s1.length();i++)
        {
            char ch1=s1.charAt(i);
            if(res.indexOf(ch1)!=-1)
            {
                continue;
            }
        
        int count=0;
        for(int j=0;j<s1.length();j++)
        {
            char ch2=s1.charAt(j);
            if(ch2==ch1)
            {
                count++;
            }
        }
    System.out.println(ch1 +":" +count);
    res+=ch1;
    }
}
}


