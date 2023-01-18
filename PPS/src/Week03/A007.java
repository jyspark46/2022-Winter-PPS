package Week03;

import java.util.Scanner;

public class A007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scale = new int[8];
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < scale.length; i++)
			scale[i] = keyboard.nextInt();
		
		int descending = 0;
		int ascending = 0;
		int nothing = 0;
		
		for(int j = 0; j < scale.length - 1; ++j) {
			
			if(scale[j] > scale[j + 1])
				descending++;
	
			else if(scale[j] < scale [j + 1])
				ascending++;
		}
		
		if(descending == 7)
			System.out.println("descending");
		
		else if(ascending == 7)
			System.out.println("ascending");
		
		else
			System.out.println("mixed");
				
		keyboard.close();

	}
}