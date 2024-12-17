// Find the second largest element of an array

public class Program56 {
    public static void main(String[] args) {
        int[] arr = {90,50,30,80,10,60,30,40,70,20};
        SecondLargestElement(arr);
    }
    private static void SecondLargestElement(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            } else if(num>secondLargest && num!=firstLargest){
                secondLargest = num;
            }
        }
        System.out.println("Second Largest element: " +secondLargest);
    }
}
