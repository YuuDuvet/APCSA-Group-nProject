import java.util.ArrayList;


public class Store extends Location {
    protected ArrayList<Item> items;


    public Store(String name) {
        super(name);
        items = new ArrayList<>();
    }


    public void displayItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }


    public Item getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
}


