import java.util.*;

public class longest{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest="";
        String current="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((current.indexOf(c))!=-1){
                current=current.substring(current.indexOf(c)+1);
            }
            current+=c;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        System.out.println("String:"+s);
        System.out.println("longest:"+longest);
    }
}