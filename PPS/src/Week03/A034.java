package Week03;

import java.util.*;

public class A034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int[] rest = new int[42];
		
		for(int i = 0; i < 10; i++) {
			num = keyboard.nextInt();
			rest[num % 42]++;
		}
		
		for(int j = 0; j < 42; j++) {
			if(rest[j] > 0)
				count++;
		}
		
		System.out.println(count);
		
		keyboard.close();
	}
}
