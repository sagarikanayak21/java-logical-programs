// Display even number from 1 to 20

public class Program4 {
    public static void main(String[] args) {
        int n = 20;
        Program4 obj = new Program4();
        obj.number(n);
    }
    private void number(int no) {
        for(int i=1; i<=20; i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
