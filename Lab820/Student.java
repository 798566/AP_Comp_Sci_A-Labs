
/**
 * Lab820
 *
 * @Sophia
 * @820
 */
public class Student{
    // instance variables of class Student
    private int studNumber;
    private boolean studActive;
    private double studGPA;
    private String studName;

    /**
     * Constructor for objects of class Student
     */
    public Student(){
        // initialise instance variables
        studNumber = 987654;
        studActive = true;
        studGPA = 4.0;
        studName = "Snowfy";
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
    public void studActive(boolean sn){
        studActive = sn;
    }
    public boolean getStudActive()  {
        return studActive;
    }
    public void studGPA (double sn){
        studGPA = sn;
    }
    public double getStudGPA()  {
        return studGPA;
    }
    public void studName(String sn){
        studName = sn;
    }
    public String getStudName() {
        return studName;
    }
    
}
