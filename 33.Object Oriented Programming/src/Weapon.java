
public class Weapon extends Item {

    private int damage;
    private String type;

    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
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
                + "\nQuantity: " + getQuantity()
                + "\nDamage: " + getDamage();
    }
}
