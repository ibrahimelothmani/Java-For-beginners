

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;

        if (head == null) {
            head = tail;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        while (current != null) {
            System.out.println(current.getEmployee());
            current = current.getNext();
        }
    }
}
