//Operators
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html

class Snippet {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}