package Week03;

import java.util.*;

public class A035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int T = keyboard.nextInt();
		double[] result = new double[T];
		String line = "";
		char c;
		
		for(int i = 0; i < T; i++) {
			
			result[i] = keyboard.nextDouble();
			
			line = keyboard.nextLine();		
			
			for(int j = 1; j < line.length(); j++) {
				
				c = line.charAt(j);
				
				if(c == '@')
					result[i] *= 3;
				
				if(c == '%')
				 	result[i] += 5;
				
				if(c == '#')
				 	result[i] -= 7;	
			}
		}
		
		for(int k = 0; k < T; k++)
			System.out.println(String.format("%.2f", result[k]));
		
		keyboard.close();
	}
}
