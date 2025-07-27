import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist {
    public static void main(String args[]){
        //create an ArrayList of integers
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Initial list: "+numbers);

        //add(index,element) - Insert an index
        numbers.add(1,15);
        System.out.println("After inserting 15 at index 1: "+numbers);

        //get(index)
        System.out.println("Element at index 2: "+numbers.get(2));

        //set(index,element)
        numbers.set(2,25);
        System.out.println("After replacing index 2 at 25: "+numbers);

        //remove(index)
        numbers.remove(3);
         System.out.println("After removing element at index 3: "+numbers);

        //remove(object)
        numbers.remove(Integer.valueOf(10));
        System.out.println("After removing value 10: "+numbers);

        //contains()
         System.out.println("contains 15? "+numbers.contains(15));

        //size()
         System.out.println("size of list: "+numbers.size());

        //isEmpty()
         System.out.println("is list empty? "+numbers.isEmpty());

        //iterator()
         System.out.println("using iterator: ");
         Iterator<Integer> it=numbers.iterator();
        while(it.hasNext()){
             System.out.print(it.next()+" ");
        }
         System.out.println();

        //subList()
        List<Integer> subList=numbers.subList(0,2);
         System.out.println("sublist (0 to 2): "+subList);

        //toArray()
        Object[] arr=numbers.toArray();
        System.out.println("Array: ");
        for(Object obj:arr){
             System.out.println(obj+" ");
        }

        //clear()
        numbers.clear();
         System.out.println("\nAfter clear(): "+numbers);
        
    }
}
