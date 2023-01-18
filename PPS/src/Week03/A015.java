package Week03;

import java.util.*;

public class A015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		int verif = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			num[i] = keyboard.nextInt();
			verif += Math.pow(num[i], 2);
		}
		
		verif = verif % 10;
		System.out.println(verif);
		
		keyboard.close();
	}
}