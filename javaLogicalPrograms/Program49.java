// Find the fobonacci series

class FibonacciWithoutRecursion{    
    public static void main(String args[])    
    {      
        int count=10;
        int number1 = 0;
        int number2 = 1;
        System.out.print(number1+" "+number2);  
        for(int i=2; i<count; ++i)      
        {      
            int number3 = number1+number2;      
            System.out.print(" "+number3);  // 1 2 
            number1 = number2; 
            number2 = number3;      
        }      
    }  
}  
