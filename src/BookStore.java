
public class BookStore extends Store {


    public BookStore() {
        super("Book Store");
        items.add(new Item("Notebook", 10));
        items.add(new Item("Novel", 15));
        items.add(new Item("Planner", 20));
    }
}
