// Check a String is palindrome or not

public class Program36 {
    public static void main(String[] args) {
        String st = "sagarika";
        String rev = "";
        for(int i=0; i<st.length(); i++){
            rev = st.charAt(i)+rev;
        }
        if(st.equals(rev)){
            System.out.println(st+ " is a palindrome string");
        } else{
            System.out.println(st+" is not a palindrome string");
        }
    }
}
