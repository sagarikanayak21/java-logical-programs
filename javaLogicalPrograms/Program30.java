// Find the smallest element of an array

public class Program30 {
    public static void main(String[] args) {
        int[] a = {60,30,50,10,50,20,90,50,70,40};
        int smallest = a[0];
        for(int i=1; i<a.length; i++){
            if(smallest>a[i]){
                smallest = a[i];
            }
        }
        System.out.println("Smallest element of an array is: " +smallest);
    }
}
