package Week04;
import java.util.*;

public class A046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		String name = "";
		char first;
		int[] firstName = new int[26];
		
		for(int i = 0; i < N; i++) {
			name = keyboard.next();
			first = name.charAt(0);
			firstName[first - 'a']++;
		}
		
		String answer = "";
		int count = 0;
		
		for(int j = 0; j < 26; j++) {
			if(firstName[j] >= 5) {
				char c = (char)(j + 'a');
				answer += Character.toString(c);
				count++;
			}
		}
		
		if(count == 0)
			System.out.println("PREDAJA");
		
		else
			System.out.println(answer);
		
		keyboard.close();
	}
}