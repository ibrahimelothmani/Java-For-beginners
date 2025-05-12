import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer
        System.out.println("Hello, " + name + "! You are "
                + age + " years old.");

    }
}