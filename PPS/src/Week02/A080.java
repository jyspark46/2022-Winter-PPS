package Week02;
import java.util.Arrays;

class A080 {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        
        int count = 0; 
        
        for(int i = 0; i < nums.length; i++) {
            
            if(count + 1 > (nums.length / 2))
                return nums[i];
            
            else if(nums[i] == nums[i + 1])
                count++;
            
            else
                count = 0; 
        }
        
        return nums[count];
    }
}