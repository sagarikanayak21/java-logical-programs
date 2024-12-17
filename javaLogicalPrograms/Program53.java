// Add Integer values to a List and display the square of those elements by using Iterator, forEach loop and lambda expression.

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Program53 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(5);
        l.add(7);
        l.add(2);
        l.add(4);

        // by using Iterator
        System.out.println("Output by Iterator");
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            Integer elements = (Integer)itr.next();
            Integer squareNo = elements*elements;
            System.out.println(squareNo);
        }

        // by using forEach loop
        System.out.println("Output by forEach loop");
        for(Integer elements: l ){
            Integer squareNo = elements*elements;
            System.out.println(squareNo);
        }

        // by using lambda expression
        System.out.println("Output by Lambda expression");
        l.stream()
        .map(elements -> elements * elements)
        .forEach(System.out::println); 

    }
}
