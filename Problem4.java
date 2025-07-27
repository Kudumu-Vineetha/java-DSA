import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
     double sum=0;
    while(n>0)
    {
        count++;
        int digit=n%10;
        sum=sum+Math.pow(digit,count);
        
        n=n/10;
     
    }
    System.out.println(sum);

}
}