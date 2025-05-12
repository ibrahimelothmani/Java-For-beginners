//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        For scenarios where you need to modify strings frequently, use StringBuilder
//        (not thread-safe) or StringBuffer (thread-safe) for better performance due to
//        their mutable nature.
//        Example:

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb.toString()); // "Hello, World!"

        // StringBuffer (thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(", World!");
        System.out.println(sbf.toString()); // "Hello, World!"

    }
}