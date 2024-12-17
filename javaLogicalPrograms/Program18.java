// Check a number is palindrome or not

public class Program18 {
    public static void main(String[] args) {
        int n = 484;
        Program18.number(n);
    }
    private static void number(int no){
        int temp = no;
        int rev = 0;
        while(no>0){
            int rem = no%10;
            rev = (rev*10)+rem;
            no = no/10;
        }
        if(temp==rev){
            System.out.println(temp+ " is a palindrome number");
        } else{
            System.out.println(temp+ " is not a palindrome number");
        }
    }
}
