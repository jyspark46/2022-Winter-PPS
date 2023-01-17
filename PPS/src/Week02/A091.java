package Week02;

import java.util.*;

class A091 {
    public int removeElement(int[] nums, int val) {

        int[] idxArr = new int[101];
        Arrays.fill(idxArr, 0);
        for(int n : nums)
            idxArr[n]++;

        idxArr[val] = 0;

        int i = 0;
        for(int j = 0; j <101; j++) {

            int count = idxArr[j];
            
            while(count > 0) {
                nums[i] = j;
                count--;
                i++;
            }
        }

        return i;
    }
}