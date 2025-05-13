import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ibrahim", 100));

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employees.forEach(employeeLinkedList::addToFront);
        System.out.println("Size: " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
        System.out.println("####################################################################");
        System.out.println("Adding to end");
        employees.forEach(employeeLinkedList::addToEnd);
        System.out.println("Size: " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
        System.out.println("####################################################################");
        System.out.println("Removing from front");
        EmployeeNode removedNode = employeeLinkedList.removeFromFront();
        System.out.println("Removed: " + removedNode.getEmployee());
        System.out.println("Size: " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
        System.out.println("####################################################################");
        System.out.println("Removing from end");
        removedNode = employeeLinkedList.removeFromEnd();
        System.out.println("Removed: " + removedNode.getEmployee());
        System.out.println("Size: " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
    }
}