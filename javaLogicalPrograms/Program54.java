// Add Integer elements to a List and diplay even and odd numbers separately.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program54 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(5);
        l.add(7);
        l.add(2);
        l.add(4);

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            Integer elements = (Integer)itr.next();
            if(elements%2==0){
                evenList.add(elements);
            } else{
                oddList.add(elements);
            }
        }
        // print even numbers
        for(Integer evenNo : evenList){
            System.out.print(evenNo + " ");
        }
        System.out.println();

        // print odd numbers
        for(Integer oddNo : oddList){
            System.out.print(oddNo + " ");
        }
    }
}