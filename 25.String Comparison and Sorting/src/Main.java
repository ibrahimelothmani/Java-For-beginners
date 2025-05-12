//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        compareTo(String anotherString) : Compares two strings lexicographically.
//        compareToIgnoreCase(String str) : Compares two strings lexicographically,
//        ignoring case differences.
//        Example:

        String str1 = "apple";
        String str2 = "banana";
        int result = str1.compareTo(str2); // Negative value (apple is less than banana)
        int resultIgnoreCase = str1.compareToIgnoreCase("Banana"); // Negative value
        System.out.println(result);
        System.out.println(resultIgnoreCase);
    }
}