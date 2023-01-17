package Week02;
class A087 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int[] sortedBoxes = new int[1001];
        int answer = 0;

        for(int[] boxType : boxTypes)
            sortedBoxes[boxType[1]] += boxType[0];

        for(int idx = 1000; idx > 0; idx--) {
            
            if(truckSize == 0)
                break;
            
            else {
                
                if(truckSize >= sortedBoxes[idx]) {
                    answer += idx * (sortedBoxes[idx]);
                    truckSize -= sortedBoxes[idx];
                }

                else {
                    answer += idx * (truckSize);
                    break;
                }
            }
        }

        return answer;
    }
}