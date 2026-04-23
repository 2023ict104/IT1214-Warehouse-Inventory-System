import java.util.Scanner;
public class Warehouse {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        String choice;
        do {
            System.out.println("\n*** Menu of Warehouse ***");
            System.out.println("1)Add Item");
            System.out.println("2)Remove Item");
            System.out.println("3)Update Quantity");
            System.out.println("4)Search Item");
            System.out.println("5)Display All Items");
            System.out.println("6)Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ID of Item: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name of Item: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity of Item: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price of Item: ");
                    double price = sc.nextDouble();
					sc.nextLine();

                    inventory.addItem(new Item(id, name, qty, price));
                    break;
                    
                case "2":
                    System.out.print("Enter ID of Item to remove: ");
                    inventory.removeItem(sc.nextLine());
                    break;

                case "3":
                    System.out.print("Enter ID of Item: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
					sc.nextLine();
					
                    inventory.updateQuantity(updateId, newQty);
                    break;

                case "4":
                    System.out.print("Enter ID or Name of Item: ");
                    inventory.searchItem(sc.nextLine());
                    break;

                case "5":
                    inventory.displayItems();
                    break;

                case "6":
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Error....Invalid choice!");
            }

        } while (!choice.equals("6"));
    }
            
}
