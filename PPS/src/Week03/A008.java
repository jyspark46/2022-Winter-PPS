package Week03;

import java.util.*;

public class A008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int C = keyboard.nextInt();
		ArrayList<Integer>[] scoreArr = new ArrayList[C];
		for(int n = 0; n < C; n++) {
			scoreArr[n] = new ArrayList<Integer>();
		}
		
		ArrayList<Integer> init;
		
		double ratio = 0.0;
		int[] N = new int[C];
		int[] average = new int[C];
		int score = 0;
		
		for(int i = 0; i < C; i++) {
			
			init = new ArrayList<Integer>(0);
			N[i] = keyboard.nextInt();
			int scoreSum = 0;
			
			for(int j = 0; j < N[i]; j++) {
				scoreArr[i] = init;
				score = keyboard.nextInt();
				scoreArr[i].add(score);
				scoreSum += score;
			}
			
			average[i] = scoreSum / N[i];
		}
			
		for(int k = 0; k < C; k++) {	
			
			int count = 0;
			
			for(int l = 0; l < N[k]; l++) {
				if(scoreArr[k].get(l) > average[k])
					count++;
			}
			
			ratio = (double)count / (double)N[k] * 100;
			
			System.out.println(String.format("%.3f", ratio) + "%");
		}
		
		keyboard.close();
	}
}