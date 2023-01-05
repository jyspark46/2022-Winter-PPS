package Week01;
class A023 {
    public int addDigits(int num) {

        int adding = num;
        
        while(true) {

            adding = num;
            if(num >= 0 && num <= 9)
                return num;
            
            int sum = 0;
            while(adding != 0){
                int n = adding % 10;
                sum += n;
                adding /= 10;
            }

            num = sum;
        } 
    }
}