//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LinkedStack stack = new LinkedStack();
        stack.push(new Employee(1, "John", "Doe"));
        stack.push(new Employee(2, "Jane", "Smith"));
        stack.push(new Employee(3, "Jim", "Brown"));

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        stack.printStack();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());

        stack.printStack();
    }
}