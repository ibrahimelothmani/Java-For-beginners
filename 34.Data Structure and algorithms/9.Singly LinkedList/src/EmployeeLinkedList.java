

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (head == null) {
            head = node;
        } else {
            EmployeeNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }
    public EmployeeNode removeFromFront() {
        if (head == null) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        return removedNode;
    }
    public EmployeeNode removeFromEnd() {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            EmployeeNode removedNode = head;
            head = null;
            size--;
            return removedNode;
        }
        EmployeeNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        EmployeeNode removedNode = current.getNext();
        current.setNext(null);
        size--;
        return removedNode;
    }
    public int getSize() {
        return size;
    }
    public void printList() {
        EmployeeNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
