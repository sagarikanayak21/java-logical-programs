// Find the largest element of an array

public class Program29 {
    public static void main(String[] args) {
        int[] a = {60,30,50,10,50,20,90,50,70,40};
        int largest = a[0];
        for(int i=1; i<a.length; i++){
            if(largest<a[i]){
                largest = a[i];
            }
        }
        System.out.println("Largest element of an Array is: " +largest);
    }
}
