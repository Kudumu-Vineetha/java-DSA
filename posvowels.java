import java.util.*;
public class posvowels{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String res="";
            //char[] input=s.toLowerCase().toCharArray();
            for(int i=0;i<s.length();i++){
                if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                    for (int j=0; j<=i;j++){
                        res+=s.charAt(i);
                    }
                }
                else{
                    res+=s.charAt(i);
                }

            }
            System.out.print(res);
        }
}