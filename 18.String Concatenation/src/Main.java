//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Using + Operator: Concatenates strings.
//        Using concat(String str) : Concatenates the specified string.
//        Examples:

        String str1 = "Hello";
        String str2 = "World!";
        String combined = str1 + ", " + str2; // "Hello, World!"
        String combined2 = str1.concat(", ").concat(str2); // "Hello, World!"
        System.out.println(combined);
        System.out.println(combined2);
    }
}