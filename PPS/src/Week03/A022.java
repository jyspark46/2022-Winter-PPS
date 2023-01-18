package Week03;

import java.util.*;

public class A022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		int[] time = new int[N];
		int Y = 0;
		int M = 0;
		
		for(int i = 0; i < N; i++) {
			
			time[i] = keyboard.nextInt();
			
			Y += (time[i] / 30 + 1) * 10;
			M += (time[i] / 60 + 1) * 15;	
		
		}
		
		if(Y > M)
			System.out.println("M " + M);
		
		else if(Y < M)
			System.out.println("Y " + Y);
		
		else
			System.out.println("Y M " + Y);

		keyboard.close();
	}
}