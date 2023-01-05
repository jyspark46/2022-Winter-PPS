package Week01;
import java.util.*;

class A037 {
    public List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList arr = new ArrayList();
        int a, b, c = 0, count = 0, n = 0;

        for(int i = left; i <= right; i++) {

            b = i;
            
            while(b > 0) {

                c = b % 10;
                n++;
                b /= 10;
                
                if(c != 0) {
                    if(i % c == 0)
                        count++;
                }
            }

            if(n == count)
                arr.add(i);

            count = 0;
            n = 0;
        }
        
        return arr;
    }
}