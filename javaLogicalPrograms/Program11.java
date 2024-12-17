// Display number from 10 to 1

public class Program11 {
    public static void main(String[] args) {
        int n = 10;
        Program11.number(n);
    }
    private static void number(int no) {
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }
}
