import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    double sum=0;
    int temp=n;

    while(temp>0)
    {

        int digit=n%10;
        sum=sum+Math.pow(digit,count);
	temp=temp/10;
	count--;
    
     
    }
    System.out.println(sum);

}
}