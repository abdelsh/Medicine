package medicine;

public class Item {
    
    private String name;
    private int ID;

    public Item(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", ID=" + ID + '}';
    }
    
}
