import java.util.*;

public class anagrams{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2=sc.nextLine();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int n1=s1.length(),n2=s2.length();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(n1==n2){
        if(Arrays.equals(ch1,ch2))
        {
            System.out.print("Anagram");
        }
        }
        else{
            System.out.print("not a Anagram");
        }
    }
}

