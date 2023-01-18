package Week03;

import java.util.*;

public class A032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int T = keyboard.nextInt();
		int k = 0;
		int n = 0;
		
		for(int i = 0; i < T; i++) {
			
			k = keyboard.nextInt();
			n = keyboard.nextInt();
			
			System.out.println(getCount(k, n));
		}
		
		keyboard.close();
	}
	
	public static int getCount(int a, int b) {
		
		if(b == 1)
			return 1;
		
		if(a == 0)
		    return b;
		
		return (getCount(a - 1, b) + getCount(a, b - 1));
	}
}