package Week01;
import java.util.*;

class A014 {
    public List<String> summaryRanges(int[] nums) {

        List<String> range = new ArrayList();

        if(nums == null || nums.length == 0)
            return range;

        int position = nums[0];
        int len = nums.length;

        for(int i = 0; i < nums.length; i++){
            
            if(i == len - 1 || nums[i] + 1 != nums[i + 1]) {
                
                if(nums[i] == position)
                    range.add("" + position);
                
                else
                    range.add("" + position + "->" + nums[i]);

                if(i != len - 1)
                    position = nums[i + 1];
            }
        }

        return range;
    }
}