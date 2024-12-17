// Check a number is even or odd

public class Program6 {
    public static void main(String[] args) {
        int n = 21;
        Program6.check(n);
    }
    private static void check(int no){
        if(no%2==0)
            System.out.println("The number " +no+ " is a even number");
        else{
            System.out.println("The number " +no+ " is a odd number");
        }
    }
}
