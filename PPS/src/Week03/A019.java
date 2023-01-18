package Week03;

import java.util.*;

public class A019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] num = new int[3];
		int mult = 1;
		
		for(int i = 0; i < 3; i++) {
			num[i] = keyboard.nextInt();
			mult *= num[i];
		}
		
		String temp = Integer.toString(mult);
		int[] count = new int[10];

        for(int j = 0; j < temp.length(); j++)
        	count[temp.charAt(j) - '0']++;

		for(int k = 0; k < 10; k++)
			System.out.println(count[k]);
        
		keyboard.close();
	}
}
