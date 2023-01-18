package Week03;

import java.util.*;

public class A021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		int[] multiTab = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			multiTab[i] = keyboard.nextInt();
			count += (multiTab[i] - 1);
		}
		
		count++;
		
		System.out.println(count);
	}
}
