// Swap two numbers without using external variable

public class Program24 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping the value of a and b are: " +a+ " and " +b);
        a = a*b;  //200
        b = a/b;  //10
        a = a/b;  //20
        System.out.println("After swapping the value of a and b are " +a+ " and " +b);
    }
}
