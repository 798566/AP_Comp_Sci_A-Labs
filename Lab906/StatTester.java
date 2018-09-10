
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @Sophia Raab 
 * @910
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    int[] nums;
    nums = new int[100];
    public void loadArray(){
        for( int i = 0; i < nums.length; i++){
            nums[i] = int (Math.random()*10 + 1);
        }
        int sum = 0
        for(int 1 = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
