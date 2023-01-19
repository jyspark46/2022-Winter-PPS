package Week04;

public class A096 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;

        while(n != 0) {

            int twosComplement = n & -n;
            n -= twosComplement;
            count++;
        }
        
        return count;
    }
}