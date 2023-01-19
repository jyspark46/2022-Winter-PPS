package Week04;

import java.time.*;

class A116 {
    public String dayOfTheWeek(int day, int month, int year) {
        
        String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        LocalDate date = LocalDate.of(year, month, day);
        int index = date.getDayOfWeek().getValue() % 7;
        
        return days[index];
    }
}