package Week03;

import java.util.Scanner;

public class A017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		
        String temp = Integer.toString(N);
        int[] numCount = new int[10];
        int num = 0;
        int max = 0;
 
        for(int i = 0; i < temp.length(); i++) {
            num = temp.charAt(i) - '0';
            numCount[num]++;

        }

        int dupl = (numCount[6] + numCount[9]);

        if(dupl % 2 == 0) {
        	numCount[6] = dupl / 2;
        	numCount[9] = dupl / 2;
        }

        else {
        	numCount[6] = dupl / 2 + 1;
        	numCount[9] = dupl / 2 + 1;
        }

        for(int i : numCount)
            max = Math.max(max, i);
  
        System.out.println(max);
        
        keyboard.close();
	}
}