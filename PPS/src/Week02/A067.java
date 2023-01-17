package Week02;
class A067 {
    public String removeDuplicates(String s) {

        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()) {

            if(str.length() != 0 && str.charAt(str.length() - 1) == c)
                str.deleteCharAt(str.length() - 1);
            
            else
                str.append(c);
        }

        return str.toString();
    }
}