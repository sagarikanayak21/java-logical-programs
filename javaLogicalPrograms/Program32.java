// The number of occurance of element of an array

public class Program32 {
    public static void main(String[] args) {
        int[] a = {60,30,50,10,50,20,90,50,70,40};
        int n = 50;
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(n==a[i]){
                count = count+1;
            }
        }
        System.out.println("Number of occurance of " +n+ " is: " +count);
    }
}