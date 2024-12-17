// Reverse a number 45 (without using any loop)

public class Program16 {
    public static void main(String[] args) {
        int n = 45;
        int rem = n%10;   // 5
        int quo = n/10;   // 4
        int rev = (rem*10)+quo;  //54
        System.out.println("Reverse of " +n+ " is: " +rev);
    }
}
