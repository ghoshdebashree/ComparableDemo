public class Employee implements Comparable<Employee>{
    public String name;

    public int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
 // SORT ACCORDING TO AGE
//    @Override
//    public int compareTo(Employee o) {
//        return this.age - o.age;
//    }
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
