import java.util.*;
public class Linkedlist {
    public static void main(String args[]){
        //create a linkedlist of strings
        LinkedList<String>list =new LinkedList<>();
        
        //add()- Add elements at the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add(): "+list);

        //add(index,element)-Insert element at specific index
        list.add(1,"Mango");
        System.out.println("After add(1,\"mango\"):"+list);

        //addFirst() - Add element at the start
        list.addFirst("Orange");
        System.out.println("after addfirst(\"orange\"): "+list);

        //addLast() - Add element at the end
        list.addLast("Graphes");
        System.out.println("after addlast(\"Graphes\"): "+list);

        //get(index)
        System.out.println("element at index 2: "+list.get(2));

        //getFirst()& getLast()
        System.out.println("First element:" +list.getFirst());
        System.out.println("last element: "+list.getLast());
        
        //set(index,element)
        list.set(2,"kiwi");
        System.out.println("replace index 2 at kiwi: "+list);

        //remove(index)
        list.remove(3);
        System.out.println("after remove(3):"+list);

        //remove(object)
        list.remove("Apple");
        System.out.println("after remove apple: "+list);

        //removeFirst() & removeLast()
        list.removeFirst();
        System.out.println("After removefirst: "+list);
        list.removeLast();
        System.out.println("After removelast: "+list);

        //contains(object)
         System.out.println("contains banana? "+list.contains("Banana"));

        //indexOf() & lastIndexOf()
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        System.out.println("List now: "+list);
        System.out.println("first index of banana: "+list.indexOf("Banana"));
        System.out.println("last index of banana: "+list.lastIndexOf("Banana"));

        //peek()
        System.out.println("peek (head element): "+list.peek());

        //toArray()
        Object[] arr=list.toArray();
        System.out.println("Array version: ");
        for(Object obj:arr){
            System.out.print(obj+ " ");
        }
        System.out.println();

        //clear()
        list.clear();
        System.out.println("After clear(): "+list);
    }
    
}
