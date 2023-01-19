package Week04;

class A101 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aSum = 0, bSum = 0, i = 0, j = 0;

        for(i = 0; i < aliceSizes.length; i++)
            aSum += aliceSizes[i];

        for(i = 0; i < bobSizes.length; i++)
            bSum += bobSizes[i];

        int position = (aSum - bSum) / 2;
        int[] answer = new int[2];
        
        for(i = 0; i < aliceSizes.length; i++) {

            for(j = 0; j < bobSizes.length; j++) {
                
                if(aliceSizes[i] == bobSizes[j] + position) {
                    answer[0] = aliceSizes[i];
                    answer[1] = bobSizes[j];
                }
            }
        }

        return answer;
    }
}
