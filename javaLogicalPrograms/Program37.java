// Check a number is a prime number or not

public class Program37 {
    public static void main(String[] args) {
        int n = 3;
        int flag = 0;    
        int m = n/2;  
        if(n==0||n==1){
            System.out.println(n+" is not prime number");   
        }else{
            for(int i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is prime number");
            }
        }
    }
}
