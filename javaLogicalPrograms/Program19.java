// Find the factorial of a number using for loop

public class Program19 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for(int i=n; i>1; i--){
            fact = fact*i;  
        }
        System.out.println("Factorial of " +n+ " is: " +fact);
    }
}
