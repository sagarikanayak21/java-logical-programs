// Calculate the permutation of two number in main method (formula: n p r = n!/(n-r)!)

public class Program21 {
    public static void main(String[] args) {
        int n = 10;
        int r = 8;
        int q = n-r;
        int dividendFact = 1;
        int divisorFact = 1;
        while(n>1){
            dividendFact = dividendFact*n;
            n--;
        }
        while(q>1){
            divisorFact = divisorFact*q;
            q--;
        }
        float permutation = (float)dividendFact/divisorFact;
        System.out.println("Permutation value is: " +permutation);
    }
}
