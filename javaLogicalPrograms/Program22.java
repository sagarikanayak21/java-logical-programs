// Calculate the permutation of two number using separate method (formula: n p r = n!/(n-r)!)

public class Program22 {
    public static void main(String[] args) {
        int n = 10;
        int r = 8;
        int q = n-r;
        Program22 obj = new Program22();
        int dividendFact = obj.factorial(n);
        int divisorFact = obj.factorial(q);
        float permutation = (float)dividendFact/divisorFact;
        System.out.println("Permutation value of " +n+ " and " +r+ " is: " +permutation);
    }
    public int factorial(int n){
        int fact = 1;
        while(n>1){
            fact = fact*n;
            n--;
        }
        return fact;
    }
}
