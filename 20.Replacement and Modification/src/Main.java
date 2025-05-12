//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        replace(char oldChar, char newChar) : Replaces all occurrences of oldChar with newChar .
//        replaceAll(String regex, String replacement) :
//        Replaces each substring of this string that matches the given regular expression with the given
//        replacement.

        String str = "Hello, World!";
        String replaced = str.replace('o', 'a'); // "Hella, Warld!"
        String replacedAll = str.replaceAll("o", "a"); // "Hella, Warld!"
        System.out.println(replaced);
        System.out.println(replacedAll);
    }
}