import java.util.*;
public class Duplicatesl1 {
    public static void main(String args[]){
        int nums[]={1,2,3,1};
        HashSet<Integer> res=new HashSet<>();
        for(int i:nums){
            if(res.contains(i))
            {
                System.out.print("true");
                return;
            }
            res.add(i);
        }
        System.out.print("false");
    }
    
}
