// Addition of two numbers by using all types of arguments and return type

public class Program1 {
    public static void main(String[] args) {
        Program1.add1();
        Program1 obj = new Program1();
        int sum2 = obj.add2();
        System.out.println("Addition value of 30 and 40 is: " +sum2);
        obj.add3(50, 60);
        int sum4 = Program1.add4(70, 80);
        System.out.println("Addition value of 70 and 80 is: " +sum4);
    }

    // By using no arguments and no return type
    private static void add1(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("Addition value of " +a+ " and " +b+ " is: " +sum);
    }

    // by using no arguments and return type
    private int add2(){
        int c = 30;
        int d = 40;
        int sum = c+d;
        return sum;
    }

    // By using arguments and no return type
    private void add3(int e, int f){
        int sum = e+f;
        System.out.println("Addition value of " +e+ " and " +f+ " is: " +sum);
    }

    // By using arguments and return type
    private static int add4(int g, int h){
        int sum = g+h;
        return sum;
    }
}
