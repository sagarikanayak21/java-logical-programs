// Create two List and add four elements to each List, match the 1st element of 2nd list with 1st element of 1st list till the last element. If the elements are same/matched than reverse that element and add in the 3rd list and print the 3rd list.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program51 {
    public static void main(String[] args) {
        List l1 = new ArrayList<String>();
        List l2 = new ArrayList<String>();
        l1.add("Sagrika");
        l1.add("Lucky");
        l1.add("Sidhartha");
        l1.add("Priyanka");

        l2.add("Saga");
        l2.add("Shreya");
        l2.add("Sidhartha");
        l2.add("Mama");

        ArrayList l3 = new ArrayList<>();

        String rev = "";

        for(int i=0; i<l1.size(); i++){
            String s1 = (String)l1.get(i);
            String s2 = (String)l2.get(i);
            // if (s2.equals(s1)) {
            //     String reversed = new StringBuilder(s2).reverse().toString();
            //     l3.add(reversed);
            // }

            if(s2.equals(s1)){
                for(int j=0; j<s2.length(); j++){
                    rev = s2.charAt(j) + rev;
                }
                l3.add(rev);
            }
        }

        Iterator itr = l3.iterator();
        while (itr.hasNext()) {
            String s3 = (String)itr.next();
            System.out.println(s3);
        }

    }
}
