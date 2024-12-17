// Display odd number from 50 to 20

public class Program14 {
    public static void main(String[] args) {
        int startNo = 50;
        int endNo = 20;
        Program14.number(startNo, endNo);
    }
    private static void number(int sNo, int eNo){
        for(int i=sNo; i>=eNo; i--){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}