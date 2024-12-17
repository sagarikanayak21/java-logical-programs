// Display even number from 20 to 40

public class Program5 {
    public static void main(String[] args) {
        int startNo = 20;
        int endNo = 40;
        Program5.number(startNo, endNo);
    }
    private static void number(int sNo, int eNo){
        for(int i=sNo; i<=eNo; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
