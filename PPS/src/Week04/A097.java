package Week04;

class A097 {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while(numbers[left] + numbers[right] != target) {

            int sum = numbers[left] + numbers[right];

            if(sum < target)
                left++;
            
            else
                right--;
        }

        return new int[] { left + 1, right + 1 };
    }
}