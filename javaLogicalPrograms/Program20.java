// Find the factorial of a number using while loop

public class Program20 {
    public static void main(String[] args) {
        int n = 5;
        int temp = n;
        int fact = 1;
        while(n>1){
            fact = fact*n;
            n--;
        }
        System.out.println("Factorial of " +temp+ " is: " +fact);
    }
}
