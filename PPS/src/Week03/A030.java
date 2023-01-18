package Week03;

import java.util.*;

public class A030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		int mood = keyboard.nextInt();
		double goodGood = keyboard.nextDouble();
		double goodBad = keyboard.nextDouble();
		double badGood = keyboard.nextDouble();
		double badBad = keyboard.nextDouble();
		
		double[] good = new double[101];
		double[] bad = new double[101];
		
		if(mood == 0) {
			good[0] = goodGood;
			bad[0] = goodBad;
		}
		
		else {
			good[0] = badGood;
			bad[0] = badBad;
		}
		
		for(int i = 1; i <= N; i++) {
		    good[i] = good[i - 1] * goodGood + bad[i - 1] * badGood;
		    bad[i] = good[i - 1] * goodBad + bad[i - 1] * badBad;
		}
		
		System.out.println(String.format("%.0f", good[N - 1] * 1000));
		System.out.println(String.format("%.0f", bad[N - 1] * 1000));
		
		keyboard.close();
	}
}