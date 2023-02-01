package Week04;

class A133 {
    public String capitalizeTitle(String title) {

        String[] input = title.split(" ");
        String result = "";

        for(int i = 0; i < input.length; i++) {

            String str = input[i];

            if(str.length() < 3)
                result += str.toLowerCase();
            
            else {
                result += String.valueOf(str.charAt(0) >= 'a' && str.charAt(0) <= 'z' ? (char)(str.charAt(0) - 32) : str.charAt(0));
                result += str.subSequence(1, str.length()).toString().toLowerCase();
            }

            if(i < input.length - 1)
                result += " ";
        }
        
        return result;
    }
}