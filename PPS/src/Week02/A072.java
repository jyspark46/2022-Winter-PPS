package Week02;
class A072 {

    int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int dayOfYear(String date) {

        String[] str = date.split("-");

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);

        if(year % 4 == 0) {
            if(year % 400 == 0 || year % 100 != 0)
                days[2] = 29;
        }
        
        int d = day;
        for(int i = 1; i < month; i++)
            d += days[i];
        
        return d;
    }
}