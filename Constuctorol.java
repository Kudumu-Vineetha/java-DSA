public class Constuctorol {
    
    // Constructor with int parameters
    Constuctorol(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    } 
    
    // Constructor with float parameters
    Constuctorol(float a, float b) {
        System.out.println("Sum of floats: " + (a + b));   
    }

    public static void main(String args[]) {
        Constuctorol m = new Constuctorol(2, 3);     // Calls int constructor
        Constuctorol n = new Constuctorol(4f, 5f);   // Calls float constructor
    }
}
