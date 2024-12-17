// Reverse a number 341

public class Program17 {
    public static void main(String[] args) {
        int n = 341;
        Program17.number(n);
    }
    private static void number(int no){
        int temp = no;
        int rev = 0;
        while(no>0){
            int rem = no%10;
            rev = (rev*10) + rem;
            no = no/10;
        }
        System.out.println("Reverse number of " +temp+ " is: " +rev);
    }
}
