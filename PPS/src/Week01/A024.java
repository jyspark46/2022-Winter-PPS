package Week01;
class A024 {

    private int dollar5 = 0;
    private int dollar10 = 0;
    private int dollar20 = 0;

    public boolean lemonadeChange(int[] bills) {

        for(int bill : bills) {

            if(!summation(bill - 5))
                return false;

            if(bill == 5)
                dollar5++;

            else if(bill == 10)
                dollar10++;
            
            else
                dollar20++;
        }

        return true;
    }

    private boolean summation(int sum) {
        
        if(sum == 0)
            return true;
        
        if(sum >= 20){
            int m = sum / 20;
            int n = Math.min(m, dollar20);
            sum -= (20 * n);
            dollar20 -= n;
        }

        if(sum >= 10){
            int m = sum / 10;
            int n = Math.min(m, dollar10);
            sum -= (10 * n);
            dollar10 -= n;
        }

        if(sum >= 5){
            int m = sum / 5;
            int n = Math.min(m, dollar5);
            sum -= (5 * n);
            dollar5 -= n;
        }

        if(sum == 0)
            return true;
        
        return false;
    }
}