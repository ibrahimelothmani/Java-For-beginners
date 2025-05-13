public class EmployeeDoubleLinkedList {

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

    public EmployeeNode removeFromFront() {
        if (head == null) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        if (head == null) {
            tail = null;
        }
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (head == null) {
            return null;
        }
        if (head == tail) {
            EmployeeNode removedNode = head;
            head = null;
            tail = null;
            size--;
            return removedNode;
        }
        EmployeeNode current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        EmployeeNode removedNode = tail;
        tail = current;
        tail.setNext(null);
        size--;
        return removedNode;
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
