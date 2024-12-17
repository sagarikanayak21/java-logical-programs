// Add and print List elements using Iterator and ListIterator and forEach.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program50 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Lucky");
        l.add("Sagarika");
        l.add("Sidhartha");
        l.add("Priyanka");
        System.out.println(l);  // [Lucky, Sagarika, Sidhartha, Priyanka]
        
        // print List elements by Iterator
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            String l1 = (String)itr.next();
            System.out.println(l1);
        }
        
        // print List elements by ListIterator
        ListIterator<String> ltr = l.listIterator();
        while (ltr.hasNext()) {
            String l2 = (String)ltr.next();
            System.out.println(l2);
        }

        // print List elements by forEach loop
        for(String l3:l){
            System.out.println(l3);
        }
    }
}
