//https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html
public class Snippet {
    public static void main(String[] args) {     
        
        int a = 16, b = 45;        
       
        System.out.printf("The max of %d and " + "%d is %d%n",
                          a, b, Math.max(a, b));
        
        double decimalValue = 43.74;
        
        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                decimalValue, Math.ceil(decimalValue));    

    }
}