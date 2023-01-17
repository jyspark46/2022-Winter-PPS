package Week02;
class A061 {
    public String convertToTitle(int columnNumber) {

        String answer = new String();

        while(columnNumber > 0) {
            columnNumber--;
            char temp = (char)('A' + (columnNumber % 26));
            answer = temp + answer;
            columnNumber /= 26;
        }

        return answer;       
    }
}