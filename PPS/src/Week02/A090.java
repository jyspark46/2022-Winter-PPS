package Week02;
class A090 {
    public int removeDuplicates(int[] nums) {

        int correct = 1;
        int replace = 1;

        while(replace < nums.length) {

            int previous = nums[replace - 1];
            int current = nums[replace];

            if(previous != current)
                nums[correct++] = current;

            replace++;
        }

        return correct;
    }
}