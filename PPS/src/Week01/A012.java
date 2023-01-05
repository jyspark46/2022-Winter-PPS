package Week01;
import java.util.*;

class A012 {
    public int countPrimes(int n) {

        int count =0;

        if(n == 0 || n == 1)
            return 0;
        
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= n; i++) {
            for(int j = 2 * i; j < n; j = j + i)
                isPrime[j] = false;
        }

        for(int i = 2 ; i < n; i++) {
            if(isPrime[i] == true)
                count++;
        }
        
        return count;
        
    }
}