package Week04;

import java.util.*;

public class A047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		
		for(int i = 0; i < input.length(); i += 10) {
			
			if(input.length() - i > 10)
				System.out.println(input.substring(i, i + 10));
			
			else
				System.out.println(input.substring(i, input.length()));
		}
		
		keyboard.close();
	}
}