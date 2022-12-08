import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10);
        ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

        HashSet<Employee> empHash = new HashSet<Employee>();
        empHash.add(new Employee("Vladislav", 3500, "Accounting"));
        empHash.add(new Employee("Mikhail", 3000, "Admin"));
        empHash.add(new Employee("Vladimir", 4000, "IT"));
        empHash.add(new Employee("Hanna", 2000, "Maintenance"));
        ArrayList<Employee> empList = new ArrayList<Employee>(empHash);
        Collections.sort(empList);
        System.out.println(empList);
    }
}
