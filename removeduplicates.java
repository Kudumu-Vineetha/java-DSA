import java.util.*;
public class removeduplicates{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String res="";
            char[] array=s.toCharArray();
            for(char ch:array)
            {
                if(res.indexOf(ch)==-1)
                {
                    res+=ch;
                }
            }
            System.out.print(res);
        }
}

