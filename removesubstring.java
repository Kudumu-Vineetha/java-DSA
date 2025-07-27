import java.util.*;

public class removesubstring{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // String result=s.replaceAll("ab","");
        String ss=sc.nextLine();
        String result="";
        int i=0;
        while(i<=s.length()-ss.length()){
            if(s.substring(i,i+ss.length()).equals(ss)){
                i+=ss.length();
            }
            else{
                result+=s.charAt(i);
                i++;
            }
        }
        while(i<s.length()){
            result+=s.charAt(i++);
        }
        System.out.println(result);
    }
}
