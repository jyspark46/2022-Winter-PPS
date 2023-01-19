package Week04;

import java.util.*;

class A117 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int sum = Arrays.stream(distance).sum();
        int total = 0;
        
        if(destination < start) {
            int temp = destination;
            destination = start;
            start = temp;
        }

        for(int i = start; i < destination; i++)
            total += distance[i];

        int min = Math.min(sum - total, total);
        
        return min;
    }
}