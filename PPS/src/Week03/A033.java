package Week03;

import java.util.*;

public class A033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int score;
		int max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < 5; i++) {
			
			score = 0;
			
			for(int j = 0; j < 4; j++)
				score += keyboard.nextInt();
			
			max = Math.max(max, score);
			
			if(max == score)
				maxIndex = i;
		}
		
		maxIndex++;
		System.out.println(maxIndex + " " + max);
		
		keyboard.close();
	}
}