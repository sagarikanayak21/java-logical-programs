// Find the distinct element of an array
public class Program34 {
    public static void main(String[] args) {
        int[] a = {40,20,90,50,10,80,60,70,30,10,50};
        Program34.findDistinctElement(a);
    }
    private static void findDistinctElement(int[] a){
        int b[] = new int[a.length];
        int count = 0;
        for(int i=0; i<a.length; i++) {
            boolean nomatch =true;
            for(int j=0; j<a.length; j++) {
                if(i != j && a[i] == a[j]) {
                    nomatch = false;
                    break;
                }
            }
            if(nomatch) {
                b[count] = a[i];
                count++;
            }
        }
        for(int value : b) {
            if(value != 0)
            System.out.println(value);
        }
        
    }
}
