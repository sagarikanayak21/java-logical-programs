// The number of occurance of element of an array using separate method (no return type)

public class Program33 {
    public static void main(String[] args) {
        int[] a = {60,30,50,10,50,20,30,50,70,40};
        int n = 30;
        Program33.elementOccurance(a,n);
    }
    private static void elementOccurance(int[] a, int element){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(element==a[i]){
                count = count+1;
            }
        }
        System.out.println("Number of occurance of " +element+ " in the array is: " +count);
    }
}
