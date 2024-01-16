import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparableDemo {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("debashree", 34));
        list.add(new Employee("chandan", 32));
        list.add(new Employee("umang", 1));
        list.add(new Employee("shree", 20));
        list.add(new Employee("debo", 30));
        Collections.sort(list);                         //SORTED ACCORDING TO NAME
        for(Employee emp : list){
            System.out.println("Employee name :" + emp.name + " , Employee age:" + emp.age);
        }
    }
}
