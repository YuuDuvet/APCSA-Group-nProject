<<<<<<< HEAD
import java.util.Scanner;

public class ClothingStore extends Location {

	public ClothingStore() {
	super("Clothing Store"); 
}

public Store chooseBrand(Scanner sc) {
System.out.println("\nPlease choose a brand: ");
System.out.println("1: Nike Store");
System.out.println("2: Adidas Store");

//later we can add more brands

System.out.print("Please enter number: ");
int choice = sc.nextInt();

switch(choice) {
case 1: 
return new Nike();

case 2: 
return new Adidas();

case 3: 
return new Uniqlo();

default: 
System.out.println("invalid input. Please enter a number!");
return null;

	   }
	}// end clothing store
} // end 
=======
public class ClothingStore extends Store {


    public ClothingStore() {
        super("Clothing Store");
        items.add(new Item("T-Shirt", 20));
        items.add(new Item("Jeans", 40));
        items.add(new Item("Jacket", 60));

     
    }

}

>>>>>>> 1a39af2a74d9ced68b5580e4cb5b24ceb7f92f6e
