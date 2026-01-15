import java.util.ArrayList;

public class Player {
    private int money;
    private int spent;
    private ArrayList<Item> inventory;
    private int row;
    private int col;

    public Player(int money) {
        this.money = money;
        this.spent = 0;
        inventory = new ArrayList<>();
        row = 0;
        col = 0;
    }

    public int getMoney() {
        return money;
    }

    public int getSpent() {
        return spent;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void moveNorth() {
        row--;
    }

    public void moveSouth() {
        row++;
    }

    public void moveEast() {
        col++;
    }

    public void moveWest() {
        col--;
    }

    public boolean buyItem(Item item) {
        if (item.getPrice() <= money) {
            money -= item.getPrice();
            spent += item.getPrice();
            inventory.add(item);
            return true;
        }
        return false;
    }


    public void setPosition(int row, int col) {
    this.row = row;
    this.col = col;
}
}
