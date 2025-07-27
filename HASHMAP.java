import java.util.*;
public class HASHMAP {
    public static void main(String args[]){
        //create a HashMap
        HashMap<Integer,String> map=new HashMap<>();

        //put(k,v)
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");
        System.out.println("After put(): "+map);

        //putAll(Map m)
        Map<Integer,String> anotherMap=new HashMap<>();
        anotherMap.put(4,"Dates");
        anotherMap.put(5,"Elderberry");
        map.putAll(anotherMap);
        System.out.println("After putAll(): "+map);

        //remove(object key)
        map.remove(3);
        System.out.println("After remove(3): "+map);

        //containsKey(object key)
        System.out.println("ContainsKey(1): "+map.containsKey(1));

        //get(object key)
        //containsValue(object v)
        //size()
        //isEmpty()
        //keySet()
        Set<Integer> keys=map.keySet();
        System.out.println("keyset(): "+keys);

        //values()
        Collection<String> values=map.values();
        System.out.println("values(): "+values);

        //entrySet()
        //replace(k,v)
        //clear()

    } 
}
