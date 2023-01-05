package Week01;
class A025 {
    public boolean isPowerOfFour(int n) {

        double num = Math.log(n) / Math.log(4);
        
        if(num == (int) num)
            return true;
        
        else
            return false;
    }
}