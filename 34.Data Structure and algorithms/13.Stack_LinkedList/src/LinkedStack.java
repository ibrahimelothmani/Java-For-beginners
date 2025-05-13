

public class LinkedStack {

    private class Node {
        private Employee employee;
        private Node next;

        public Node(Employee employee) {
            this.employee = employee;
        }
    }

    private Node top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(Employee employee) {
        Node node = new Node(employee);
        node.next = top;
        top = node;
        size++;
    }

    public Employee pop() {
        if (isEmpty()) {
            return null;
        }
        Employee employee = top.employee;
        top = top.next;
        size--;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            return null;
        }
        return top.employee;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.employee);
            current = current.next;
        }
    }
    public void clear() {
        top = null;
        size = 0;
    }
    public boolean contains(Employee employee) {
        Node current = top;
        while (current != null) {
            if (current.employee.equals(employee)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
