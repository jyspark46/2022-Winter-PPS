package Week01;
class A039 {
    public boolean isPerfectSquare(int num) {

        double square = Math.sqrt(num);
        int integer = (int) square;

        double substract = square - integer;
        
        if(substract == 0)
            return true;
        
        return false;
        
    }
}