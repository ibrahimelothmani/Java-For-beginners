//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "hello";
        String reversed = new StringBuilder(str).reverse().toString();
        String rev = new StringBuffer(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
        System.out.println("Reversed: " + rev);

    }
}