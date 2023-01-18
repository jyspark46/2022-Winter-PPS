package Week03;

import java.math.BigInteger;
import java.util.*;

public class A028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String first = keyboard.next();
		String second = keyboard.next();
		
		BigInteger num1 = new BigInteger(first);
		BigInteger num2 = new BigInteger(second);
		
		System.out.println(num1.add(num2));

		keyboard.close();
	}
}