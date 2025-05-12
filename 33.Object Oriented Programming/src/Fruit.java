
// Inheritance in OOP

public class Fruit extends Item {

    private String type;

    public Fruit(String type, String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Weapon: " + getName()
                + "\nType: " + getType()
                + "\nQuantity: " + getQuantity();
    }
}
