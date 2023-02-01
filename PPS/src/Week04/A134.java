package Week04;

class A134 {
    public String reversePrefix(String word, char ch) {

        int length = word.length();

        for(int i = 0; i < length; i++) {

            if(word.charAt(i) == ch) {

                char[] reverse = new char[length];

                for(int j = 0; j < length; j++)
                    reverse[j] = word.charAt(i >= 0 ? i-- : j);

                return String.valueOf(reverse);
            }
        }

        return word;
    }
}