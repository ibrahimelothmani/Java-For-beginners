//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        outer: // This is a label
        for (int i = 0; true; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer; // Breaks out of the outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

    }
}