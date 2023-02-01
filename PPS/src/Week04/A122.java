package Week04;

class A122 {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length())
            return false;

        if(s.isEmpty())
            return true;
        
        for(int i = 0; i < s.length(); i++) {
            if((s.substring(i) + s.substring(0, i)).equals(goal))
                return true;
        }

        return false;
    }
}
