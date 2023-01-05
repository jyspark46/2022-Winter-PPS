package Week01;
class A038 {
    public int mySqrt(int x) {

        int low = 0, high = x / 2;

        // 루트 1 = 1
        if(x < 2)
            return x;

        // 반복문을 돌면서 binary search
        while(low <= high) {
            double middle = low + (high - low) / 2;
            double answer = middle * middle;
            
            if(answer == x)
                return (int) middle;

            else if(answer > x)
                high = (int) middle - 1;
            
            else
                low = (int) middle + 1;
        }

        return high;
    }
}