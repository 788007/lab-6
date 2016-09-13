
/**
 * @Laurel Woods 
 * @lab 5 9/9
 */
import java.util.Arrays;
public class StatLab
{
    private int[] nums;
    public StatLab(int n){
        nums = new int[n];
    }
    public void loadRandom() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)((Math.random()* 10) + 1);
        }
    }
    public void sortArray(){
        Arrays.sort(nums);
    }
    public double findAverage() {
        int sum = 0;
        for(int k = 0; k < nums.length; k++) {
            sum = sum + nums[k];
        }
        return ((double)(sum)) /((double)(nums.length));
    }
    public String printArray(){
        String printList = "";
        for (int j = 0; j < nums.length; j++) {
            if((j + 1)% 10 == 0) {
                 printList = printList + nums[j] + "\n";
            }else {
                     printList = printList + nums[j] + "\t";
                }
        }
        return printList;
    }
    
    public double getMedian() {
        double median = 0;
        if (nums.length % 2 == 0) {
            int midIndex1 = (nums.length / 2) - 1;
            int midIndex2 = (nums.length / 2);
            median = ( (double)(nums[midIndex1]) + (double)(nums[midIndex2]) )/2;

        } else {
            int midIndex = nums.length / 2;
            median = (double)(nums[midIndex]);
        }
        return median;
    }
    
    public int getMode() {
        int mode = 0;
        int testChange = 0;
        int testControl = 0;
        int countChange = 0;
        int countControl = 0;
        for (int i = 0; i < nums.length; i++){
            testChange = nums[i];
            countChange = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == testChange) {
                    countChange ++;
                }
            }
            if (countChange >= countControl){
                testControl = testChange;
                countControl = countChange;
            }
            mode = testControl;
        }
        
        return mode;
    }
}
