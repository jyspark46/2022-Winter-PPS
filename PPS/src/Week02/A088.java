package Week02;
import java.util.ArrayList;
import java.util.Collections;

class MinStack {

    ArrayList<Integer> stackList = null;

    public MinStack() {
        stackList = new ArrayList();
    }
    
    public void push(int val) {
        stackList.add(val);
    }
    
    public void pop() {
        stackList.remove(stackList.size() - 1);
    }
    
    public int top() {
        return stackList.get(stackList.size() - 1);
    }
    
    public int getMin() {
        return Collections.min(stackList);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */