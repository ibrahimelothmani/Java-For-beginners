//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Regular expressions (regex) are powerful for pattern matching and text
//        manipulation.
//        matches(String regex) : Tells whether the string matches the given regular
//        expression.
//        replaceAll(String regex, String replacement) : Replaces each substring that
//        matches the regex with the replacement.
//        Example:

        String str = "abc123xyz";
        boolean matches = str.matches("[a-z]+\\\\d+[a-z]+");
        String cleaned = str.replaceAll("\\\\d", "");

        System.out.println(matches);
        System.out.println(cleaned);

    }
}