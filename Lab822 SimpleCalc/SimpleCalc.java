
/**
 * Lab822 SimpleCalc
 *
 * @Sophia
 * @822
 */
public class SimpleCalc{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(){
        // initialise instance variables
    }

    /**
     * SimpleCalc Methods
     */
   
    public double getAdd(int n1, int n2) {
        return n1 + n2;
    }
    public double getSubtract(int n1, int n2) {
        return n1 - n2;
    }
    public double getMultiply(int n1, int n2) {
        return n1 * n2;
    }
    public double getDivide(int n1, int n2) {
        if( n1 != 0 ){
            return n1 / n2; 
        } else {
            return 0;
        }
    }
    public double getModuloDivide(int n1, int n2) {
        if( n1 != 0 ){
            return n1 % n2; 
        } else {
            return 0;
        }
    }
}
