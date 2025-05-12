import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ibrahim", 100));
        employees.add(new Employee("Ibrahim", 200));
        employees.add(new Employee("Ibrahim", 300));
        employees.add(new Employee("Ibrahim", 400));

//        employees.forEach(employee -> System.out.println(employees));

        for (Employee employee : employees) {
            System.out.println(employees);
        }
    }
}