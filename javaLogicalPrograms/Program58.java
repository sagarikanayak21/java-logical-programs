// Write a program to reverse List elements without using any predefined method

import java.util.*;

public class Program58 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " +list);
        reverseList(list);
        System.out.println("Reversed List: " +list);
    }
    private static <T> void reverseList(List<T> list){
        int left = 0;   // start point 
        int right = list.size() - 1; // end point

        while(left<right){
            // get the elements at the left indices
            T temp = list.get(left);
            
            // swap the left and right elements
            list.set(left, list.get(right));
            list.set(right, temp);

            // move the pointers towards the center
            left++;
            right--;
        }
    }
}
