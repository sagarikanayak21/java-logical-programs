// Find the prime numbers between 1 to 20

public class Program38{  
    public static void main(String[] args){ 
        System.out.println("The Prime number are:");
        for(int i=2; i<=20; i++) {
            int count  = 0;
            for(int j=2; j<=i/2; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(" " + i);
            }
        } 
    }  
}  
