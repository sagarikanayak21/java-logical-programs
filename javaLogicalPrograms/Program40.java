// Average numbers of an Array

public class Program40 {
    public static void main(String[] args) {
        int[] a = {40,30,10,90,40,10,60,80,50,70,20};
        int count = 0;
        for(int i=0; i<a.length; i++){
            count = count+a[i];
        }
        float average = count/a.length;
        System.out.println("Average number of array element is: " +average); 
    }
}