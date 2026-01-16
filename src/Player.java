import java.util.ArrayList;

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
public class Player {
    private int money;
    private int spent;
    private ArrayList<Item> inventory;
    private int row;
    private int col;

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public Player(int money) {
        this.money = money;
        this.spent = 0;
        inventory = new ArrayList<>();
        row = 0;
        col = 0;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public int getMoney() {
        return money;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public int getSpent() {
        return spent;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public int getRow() {
        return row;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public int getCol() {
        return col;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public void moveNorth() {
        row--;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public void moveSouth() {
        row++;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public void moveEast() {
        col++;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public void moveWest() {
        col--;
    }

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public boolean buyItem(Item item) {
        if (item.getPrice() <= money) {
            money -= item.getPrice();
            spent += item.getPrice();
            inventory.add(item);
            return true;
        }
        return false;
    }


<<<<<<< HEAD


=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    public void setPosition(int row, int col) {
    this.row = row;
    this.col = col;
}
}
<<<<<<< HEAD


=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
