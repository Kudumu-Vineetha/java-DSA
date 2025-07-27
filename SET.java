import java.util.*;
public class SET {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); //duplicate will be ignored
        System.out.println("After add(): "+set);

        set.remove("Banana");
        System.out.println("After remove banana: "+set);

        //contains(Object o)
        boolean hasApple=set.contains("Apple");
        System.out.println("contains apple ? "+hasApple);

        //iterator()
        System.out.println("iterating with iterator:");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        System.out.println();
    }
    
}
