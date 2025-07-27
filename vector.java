import java.util.*;
public class vector {
    public static void main(String args[]){
        //create a vector of strings
        Vector<String> vector=new Vector<>();
        vector.add("vineetha");
        vector.add("lavanya");
        vector.add("chandana");
        vector.add("sireesha");
        System.out.println(vector);

        //remove(index)
        vector.remove(0);
        System.out.println(vector);
    }
    
}
