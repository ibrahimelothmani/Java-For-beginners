import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ibrahim", 100));

        EmployeeDoubleLinkedList EmployeeDoubleLinkedList = new EmployeeDoubleLinkedList();
        employees.forEach(EmployeeDoubleLinkedList::addToFront);
        System.out.println("Size: " + EmployeeDoubleLinkedList.getSize());
        EmployeeDoubleLinkedList.printList();
        System.out.println("####################################################################");
        System.out.println("Adding to end");
        employees.forEach(EmployeeDoubleLinkedList::addToEnd);
        System.out.println("Size: " + EmployeeDoubleLinkedList.getSize());
        EmployeeDoubleLinkedList.printList();
        System.out.println("####################################################################");
        System.out.println("Removing from front");
        EmployeeNode removedNode = EmployeeDoubleLinkedList.removeFromFront();
        System.out.println("Removed: " + removedNode.getEmployee());
        System.out.println("Size: " + EmployeeDoubleLinkedList.getSize());
        EmployeeDoubleLinkedList.printList();
        System.out.println("####################################################################");
        System.out.println("Removing from end");
        removedNode = EmployeeDoubleLinkedList.removeFromEnd();
        System.out.println("Removed: " + removedNode.getEmployee());
        System.out.println("Size: " + EmployeeDoubleLinkedList.getSize());
        EmployeeDoubleLinkedList.printList();
    }
}