package Week02;
import java.util.LinkedList;

class A060 {
    public int calPoints(String[] operations) {

        LinkedList<Integer> list = new LinkedList<>();

            for(String op : operations) {

                if(op.equals("C"))
                    list.removeLast();

                else if(op.equals("D"))
                    list.add(list.getLast() * 2);
                
                else if(op.equals("+"))
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                
                else
                    list.add(Integer.parseInt(op));
            }

            int sum = 0;
            for(int i : list)
                sum += i;
            
            return sum;
    }
}