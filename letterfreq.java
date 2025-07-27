import java.util.*;

public class letterfreq{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq=new int[256];
        char result=' ';
        int maxfreq=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch]++;
            if(freq[ch]>maxfreq){
                maxfreq=freq[ch];
                result=ch;
            }
        }
        System.out.println("String:"+s);
        System.out.println("repeating letter:"+result);
        System.out.println("max frequency:"+maxfreq);
    }
}