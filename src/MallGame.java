import java.util.Scanner;

<<<<<<< HEAD

// public class Main {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
   
//     import java.util.Scanner;


public class MallGame {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Location[][] mall = new Location[2][2];


=======
// public class Main {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
    
//     import java.util.Scanner;

public class MallGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Location[][] mall = new Location[2][2];

>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
        mall[0][0] = new Starbucks();
        mall[0][1] = new ClothingStore();
        mall[1][0] = new TechStore();
        mall[1][1] = new BookStore();

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
        Player player = new Player(100); // starts with $100
        System.out.println("Welcome to the Mall!");
        System.out.println("Spend $100 to win.\n");

<<<<<<< HEAD

=======
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
        while (player.getSpent() < 100) {
            Location current = mall[player.getRow()][player.getCol()];
            System.out.println("\nYou are at: " + current.getName());
            System.out.println("Money left: $" + player.getMoney());

<<<<<<< HEAD

            if (current instanceof ClothingStore) {

    ClothingStore cs = (ClothingStore) current;
    Store brandStore = cs.chooseBrand(sc);   

    if (brandStore != null) {
        brandStore.displayItems();

        System.out.print("Enter item number to buy (or 0 to skip): ");
        int choice = sc.nextInt();

        if (choice > 0) {
            Item item = brandStore.getItem(choice - 1);
            if (item != null) {
                System.out.println("Buy " + item + "? (yes/no)");
                sc.nextLine();
                String confirm = sc.nextLine();

                if (confirm.equalsIgnoreCase("yes")) {
                    if (player.buyItem(item)) {
                        System.out.println("Purchased! Money left: $" + player.getMoney());
                    } else {
                        System.out.println("Not enough money.");
                    }
                }
            }
        }
    }
}
else if (current instanceof Store) {
    // Starbucks, TechStore, BookStore still work normally
    Store store = (Store) current;
    store.displayItems();

    System.out.print("Enter item number to buy (or 0 to skip): ");
    int choice = sc.nextInt();

    if (choice > 0) {
        Item item = store.getItem(choice - 1);
        if (item != null) {
            System.out.println("Buy " + item + "? (yes/no)");
            sc.nextLine();
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                if (player.buyItem(item)) {
                    System.out.println("Purchased! Money left: $" + player.getMoney());
                } else {
                    System.out.println("Not enough money.");
                }
            }
        }
    }
}

=======
            if (current instanceof Store) {
                Store store = (Store) current;
                store.displayItems();

                System.out.print("Enter item number to buy (or 0 to skip): ");
                int choice = sc.nextInt();

                if (choice > 0) {
                    Item item = store.getItem(choice - 1);
                    if (item != null) {
                        System.out.println("Buy " + item + "? (yes/no)");
                        sc.nextLine();
                        String confirm = sc.nextLine();

                        if (confirm.equalsIgnoreCase("yes")) {
                            if (player.buyItem(item)) {
                                System.out.println("Purchased! Money left: $" + player.getMoney());
                                if (player.getSpent() >= 100) {
                                    break;
                                  }
                            } else {
                                System.out.println("Not enough money.");
                            }
                        }
                    }
                }
            }
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
System.out.println("\nChoose a store to visit:");
System.out.println("1 - Starbucks");
System.out.println("2 - Clothing Store");
System.out.println("3 - Tech Store");
System.out.println("4 - Book Store");
System.out.print("Enter 1, 2, 3, or 4: ");

<<<<<<< HEAD

int choice = sc.nextInt();


=======
int choice = sc.nextInt();

>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
if (choice == 1) {
    player.setPosition(0, 0);
}
else if (choice == 2) {
    player.setPosition(0, 1);
}
else if (choice == 3) {
    player.setPosition(1, 0);
}
else if (choice == 4) {
    player.setPosition(1, 1);
}
else {
    System.out.println("You’re staying where you are. You may choose something else");
}
        }
           
 System.out.println("\n--------------------------------");
        System.out.println("YOU SPENT $100!");
        System.out.println("SHOPPING COMPLETE 🎉");
        System.out.println("--------------------------------");
        sc.close();



<<<<<<< HEAD



       
=======
        
>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
    }
}
