// Add all element of an array

public class Program31 {
    public static void main(String[] args) {
        int[] a = {60,30,50,10,50,20,90,50,70,40};
        int add = 0;
        for(int i=0; i<a.length; i++){
            add = add + a[i];
        }
        System.out.println("Addition value of all elements is: " +add);
    }
}
