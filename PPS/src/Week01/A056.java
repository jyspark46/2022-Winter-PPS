package Week01;
class A056 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for(int i = 0; i < nums1.length; i++) {

            int j = 0;

            for(; j < nums2.length; j++) {
                if(nums1[i] == nums2[j])
                    break;
            }
           
            for(; j < nums2.length; j++) {
                if(nums1[i] < nums2[j]) {
                    nums1[i] = nums2[j];
                    break;
                }
            }
        
            if(j == nums2.length)
                nums1[i] = -1;
        }
    
        return nums1;   
    }
}