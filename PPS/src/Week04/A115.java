package Week04;

class A115 {
    public int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        for(char c : text.toCharArray())
            count[c - 'a']++;

        String balloon = "balloon";
        int[] balloonArr = new int[26];

        for(char c : balloon.toCharArray())
            balloonArr[c -'a']++;

        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < count.length; i++) {

            if(balloonArr[i] > 0 && count[i] == 0)
                return 0;
            
            if(balloonArr[i] > 0)
                answer = Math.min(answer, count[i] / balloonArr[i]);
        }

        return answer;       
    }
}