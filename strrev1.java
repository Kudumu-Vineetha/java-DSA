import java.util.*;
public class strrev1{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String res="";
            StringBuilder sb=new StringBuilder(s);
            res= sb.reverse().toString();
            System.out.print(res);
        }
}
