// Display numbers from 1 to 10

public class Program2 {
    public static void main(String[] args) {
        int n = 10;
        Program2.number(n);
    }
    private static void number(int no){
        for(int i=0; i<=no; i++){
            System.out.println(i);
        }
    }
}
