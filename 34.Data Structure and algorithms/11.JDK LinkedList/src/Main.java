import java.util.Iterator;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ibrahim", "elothmani", 100);
        Employee employee2 = new Employee("Ahmed", "elothmani", 101);
        Employee employee3 = new Employee("Ali", "elothmani", 102);
        Employee employee4 = new Employee("Omar", "elothmani", 103);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(employee1);
        list.addFirst(employee2);
        list.addFirst(employee3);
        list.addFirst(employee4);
        System.out.println("Size: " + list.size());

        // to print the list we use Iterator

        for (Employee value : list) {
            System.out.println(value);
        }

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}