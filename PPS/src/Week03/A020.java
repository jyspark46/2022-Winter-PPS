package Week03;

import java.util.*;

public class A020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] in = new int[4];
		int[] out = new int[4];
		int count = 0;
		int max = 0;
		
		for(int i = 0; i < 4; i++) {
			out[i] = keyboard.nextInt();
			count -= out[i];
			
			in[i] = keyboard.nextInt();
			count += in[i];
			
			max = Math.max(max, count);
		}
	
		System.out.println(max);
		
		keyboard.close();
	}
}