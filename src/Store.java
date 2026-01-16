import java.util.ArrayList;

<<<<<<< HEAD

public class Store extends Location {
    protected ArrayList<Item> items;


=======
public class Store extends Location {
    protected ArrayList<Item> items;

>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public Store(String name) {
        super(name);
        items = new ArrayList<>();
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public void displayItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public Item getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
}
<<<<<<< HEAD


=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
