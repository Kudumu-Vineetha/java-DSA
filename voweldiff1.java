import java.util.*;
public class voweldiff1{
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            //char[] input=s.toLowerCase().toCharArray();
            int left=0,right=s.length()-1;
            int vcount=0,vcount1=0;
            while(left<right){
                if("aeiou".indexOf(s.charAt(left))!=-1 && left!=right)
                {
                    vcount++;
                }
                if("aeiou".indexOf(s.charAt(right))!=-1)
                {
                    vcount1++;
                }
                left++;
                right--;
            }
            System.out.println("vowel difference: "+Math.abs(vcount-vcount1));
        }
}
