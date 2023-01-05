package Week01;
import java.math.*;

class A003 {
    public int[] plusOne(int[] digits) {

        // str buffer 정의
        StringBuffer num = new StringBuffer("");

        // int 배열의 값들을 하나씩 가져옴
        for(int i = 0; i < digits.length; i++) {
            num.append(String.valueOf(digits[i]));
        }

        // big int 에 1을 더하기 위해 새로운 big int 정의
        BigInteger one = new BigInteger("1");

        // str buffer -> str -> int로 바꿔서 +1 -> 다시 string
        String str = num.toString();
        BigInteger finalNum = new BigInteger(str);
        finalNum = finalNum.add(one);
        String finalStr = finalNum.toString();

        // new int 배열 선언 (새로운 크기)
        int[] finalDigits = new int[finalStr.length()];

        // str 변수 하나씩 쪼개서 int 배열에 assign
        for(int j = 0; j < finalStr.length(); j++) {
            finalDigits[j] = finalStr.charAt(j) - '0';
        }

        // int 배열 return
        return finalDigits;
        
    }
}