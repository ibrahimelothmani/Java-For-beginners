//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Strings can be created using string literals or the new keyword.

        String str1 = "Hello, World!"; // String literal
        String str2 = new String("Hello!"); // Using new keyword
        System.out.println(str1);
        System.out.println(str2);

//        Basic Methods
//        length() : Returns the length of the string.
//        charAt(int index) : Returns the character at the specified index.
//        equals(Object obj) : Compares this string to the specified object.
//        equalsIgnoreCase(String anotherString) : Compares two strings, ignoring case considerations.

        String str = "Hello, World!";
        System.out.println("Length: " + str.length());// Length: 13
        System.out.println("Character at index 1: " + str.charAt(1)); // 'e'
        System.out.println("Equality: " + str.equals("Hello"));// false
        System.out.println("Ignore case equality: " + str.equalsIgnoreCase("HELLO, WORLD!")); // true


    }
}