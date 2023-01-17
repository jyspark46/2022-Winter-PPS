package Week02;
import java.math.BigInteger;

class A063 {
    public String addBinary(String a, String b) {

        BigInteger aValue = new BigInteger(a, 2);
        BigInteger bValue = new BigInteger(b, 2);
        BigInteger sum = aValue.add(bValue);

        return sum.toString(2);
    }
}