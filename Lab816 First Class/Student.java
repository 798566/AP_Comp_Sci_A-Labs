
/**
 * Lab816 First Class
 *
 * @Sophia
 * @816
 */
public class Student{
    // instance variables of class Student
    private int studNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student(){
        // initialise instance variables
        studNumber = 0;
    }

    /**
     * Student Methods
     */
    public void studNumber(int sn){
        studNumber = sn;
    }
    public int getStudNumber()  {
        return studNumber;
    }
}
