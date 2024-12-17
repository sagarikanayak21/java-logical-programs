// Reverse a List using Collections class predefined method

import java.util.*;

public class Program57 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,8,2,0,3,8,6,1);
        reverseList(list);
        System.out.println("Reversed List is:");
        System.out.print(list);
        
    }
    public static void reverseList(List<Integer> list){
        Collections.reverse(list);
    }
}
