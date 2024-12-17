// Check a number is armstrong or not

public class Program25 {
    public static void main(String[] args) {
        int n = 370;
        int temp = n;
        int fact = 0;
        while(n>1){
            int rem = n%10;     
            fact = fact+(rem*rem*rem);    
            n = n/10; 
        }
        if(fact == temp){
            System.out.println(temp+ " is a armstrong number");
        } else {
            System.out.println(temp+ " is not a armstrong number");
        }
    }
}
