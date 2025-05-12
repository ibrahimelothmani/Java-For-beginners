//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        toUpperCase() / toLowerCase() : Converts all characters to upper/lower case.
//        trim() : Removes leading and trailing whitespace

        String str = " Hello, World! ";
        System.out.println("Trimmed: " + str.trim()); // "Hello, World!"
        System.out.println("Uppercase: " + str.toUpperCase()); // "HELLO, WORLD! "
        System.out.println("Lowercase: " + str.toLowerCase()); // "hello, world! "

    }
}