//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
//        Item item = new Item("Apples", 20);
//        Fruit fruit = new Fruit("Vegetables", "Banana", 100);
//        Weapon weapon = new Weapon("Sword", 100, 100, "S");


//        inventory.addItem(item);
//        inventory.addItem("Vegetables", "Banana", 100);
        inventory.addItem("Sword", 100, 100, "S");
//        inventory.displayInventory("Hello"); // Not a valid Item
        inventory.displayInventory("S");
    }
}