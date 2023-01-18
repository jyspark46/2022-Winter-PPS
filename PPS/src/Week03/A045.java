package Week03;

import java.util.*;

public class A045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.next().toLowerCase();
		int[] count = new int[26];
		
		for(int i = 0; i < input.length(); i++)
			count[input.charAt(i) - 'a']++;
		
		Integer[] sortedArr = Arrays.stream(count.clone()).boxed().toArray(Integer[]::new);
		Arrays.sort(sortedArr, Collections.reverseOrder());
		int max = sortedArr[0];
		
		ArrayList<Character> most = new ArrayList<Character>();
		
		for(int j = 0; j < 26; j++) {
			if(count[j] == max)
				most.add((char) ((char)j + 'a'));
		}
		
		String result = most.get(0).toString();
		
		if(most.size() == 1)
			System.out.println(result.toUpperCase());
		
		else
			System.out.println("?");

		keyboard.close();
	}
}