import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, String type, int quantity) {
        items.add(new Fruit(name, type, quantity));
    }

    public void addItem(String name, int quantity, int damage, String type) {
        items.add(new Weapon(name, quantity, damage, type));
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void displayInventory(String type) {

        for (Item item : items) {
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            }else {
                System.out.println("Not a valid item");
            }
        }
    }
}
