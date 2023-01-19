package Week04;

class A120 {
    public char findTheDifference(String s, String t) {

        int count[] = new int[26];

		for(char c : s.toCharArray())
			count[c - 'a']++;

		for(char c : t.toCharArray()) {
			
            count[c - 'a']--;

			if(count[c - 'a'] == -1)
				return c;
		}

		return ' ';
    }
}