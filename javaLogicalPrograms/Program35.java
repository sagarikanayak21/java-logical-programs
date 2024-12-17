// Reverse a String 

public class Program35 {
    public static void main(String[] args) {
        String st = "sagarika";
        String rev = "";
        for(int i=0; i<st.length(); i++){
            rev = st.charAt(i)+rev;
        }
        System.out.println("Reversed String of " +st+ " is: " +rev);
    }
}
