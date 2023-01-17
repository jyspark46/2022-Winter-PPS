package Week02;

class A093 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int first = m - 1;
        int second = n - 1;
        int size = nums1.length-1;

        while(second >= 0) {

            if(first >= 0 && nums1[first] > nums2[second]) {
                nums1[size] = nums1[first];
                size--;
                first--;
            }
            
            else {
                nums1[size] = nums2[second];
                size--;
                second--;
            }
        }
    }
}