// Display even number from 1 to 20 (i*2)

public class Program3 {
    public static void main(String[] args) {
        int n = 20;
        Program3 obj = new Program3();
        obj.number(n);
    }
    private void number(int no){
        for(int i=1; i<=no/2; i++){
            System.out.println(i*2);
        }
    }
}
