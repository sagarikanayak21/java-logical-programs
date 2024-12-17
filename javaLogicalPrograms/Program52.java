// Add values to the Map and retrive those values

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program52 {
    public static void main(String[] args) {
        HashMap hm = new HashMap<Integer,String>();
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Coconut");
        hm.put(4, "Dragon Fruit");
        hm.put(5, "Elephant Apple");

        Set s = hm.entrySet();

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> result = (Map.Entry) itr.next();
            System.out.println(result.getKey() + " " +result.getValue());
        }
    }
}
