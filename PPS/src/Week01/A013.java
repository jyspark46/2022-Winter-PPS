package Week01;
class A013 {
    public int singleNumber(int[] nums) {

        int single = 0;
        
        for(int x : nums)
            single = single^x;
        
        return single; 
    }
}