import java.util.*;

public class words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        String[] array = s.split(" ");

        for (String x:array){
            if (x.length()>0){
                res+=Character.toUpperCase(x.charAt(0))+x.substring(1)+" ";
            }
        }

        System.out.println(res.trim());
    }
}

