// write a program to rearrange an integer array and store the rearranged elements in such a way that the middle element will come first and the array elements will move like a anti-clock wise direction

public class Program55 {
    public static void main(String[] args) {
        int[] arr = {4,8,9,5,2,1,8,3,4,6,7};
        printArrayFromMiddle(arr);
    }

    public static void printArrayFromMiddle(int[] arr){
        int[] result = new int[arr.length];
        int middleIndex = arr.length/2;

        // elements from middleIndex to the end
        int index = 0;
        for(int i=middleIndex; i<arr.length; i++){
            result[index++] = arr[i];
        }

        // elements from start to middle
        for(int i=0; i<middleIndex; i++){
            result[index++] = arr[i];
        }
        
        // print the element that stored in result[]
        for(int element : result){
            System.out.print(element + " ");
        }
    }
}
