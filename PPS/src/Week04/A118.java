package Week04;

class A118 {
    public void moveZeroes(int[] nums) {

        int index = 0;
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
    }
}