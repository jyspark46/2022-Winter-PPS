package Week03;

import java.util.*;
import java.util.stream.IntStream;

public class A011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {3,3,3,3};
		double[] ratio = new double[N];
		int count;
		int player = stages.length;
		
		for(int i = 1; i <= N; i++) {
			
			count = 0;
			
			for(int j = 0; j < stages.length; j++) {
				
				if(i == stages[j])
					count++;
					
			}
			
			ratio[i - 1] = (double)count / (double)player;
			
			if(player == 0)
				ratio[i - 1] = 0.0;
			
			player -= count;
		}
		
		Double[] ratioArr = new Double[ratio.length];	
		
		for(int k = 0; k < ratio.length; k++)
			ratioArr[k] = ratio[k];
		
		Integer[] answer = IntStream.range(0, ratioArr.length).boxed().toArray(Integer[]::new);
	
		Arrays.sort(answer, new Comparator<Integer>() {
		    @Override public int compare(final Integer o1, final Integer o2) {
		        return Double.compare(ratioArr[o2], ratioArr[o1]);
		    }
		});
		
		for(int l = 0; l < answer.length; l++)
			answer[l]++;
		
		System.out.println(Arrays.toString(answer));		
	}
}