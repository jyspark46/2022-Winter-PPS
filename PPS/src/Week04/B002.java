package Week04;

import java.util.HashMap;
import java.util.List;

/*
//Definition for Employee.
class Employee {
 public int id;
 public int importance;
 public List<Integer> subordinates;
};
*/

class Employee {
	
	public int id;
	public int importance;
	public List<Integer> subordinates;

    HashMap<Integer, Employee> emp = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {

        for(Employee e : employees)
            emp.put(e.id, e);
        
        emp.get(id);
        int[] total = new int[1];
        dfs(id, total);
        
        return total[0];
    }
  
    public void dfs(int id, int[] total) {
        
        List<Integer> list = emp.get(id).subordinates;
        
        total[0] += emp.get(id).importance;
        
        if(list.size() == 0)
            return;
        
        for(Integer i : list)
            dfs(i, total);
    }
}   