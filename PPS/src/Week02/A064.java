package Week02;
import java.util.Arrays;

class A064 {
    public int heightChecker(int[] heights) {

        int[] sortedArr = heights.clone();
        Arrays.sort(sortedArr);

        int count = 0;
        
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != sortedArr[i])
                count++;
        }
        
        return count;
    }
}