import java.util.ArrayList;
public class Inventory {
      private ArrayList<Item> items = new ArrayList<>();
    
      public void addItem(Item item) {
            items.add(item);
            System.out.println("Item added successfully!");
    
      public void removeItem(String id) {
            for (Item item : items) {
                if (item.getItemId().equals(id)) {
                    items.remove(item);
                    System.out.println("Item removed.");
                    return;
                }
            }
            System.out.println("Item not found.");
        }
  
      public void updateQuantity(String id, int qty) {
            for (Item item : items) {
                if (item.getItemId().equals(id)) {
                    item.setQuantity(qty);
                    System.out.println("Quantity updated.");
                    return;
                }
            }
            System.out.println("Item not found.");
        }
  
       public void searchItem(String keyword) {
            for (Item item : items) {
                if (item.getItemId().equalsIgnoreCase(keyword) ||
                    item.getItemName().equalsIgnoreCase(keyword)) {
    
                    System.out.println("===============\nID: " + item.getItemId() + ", Name: " + item.getItemName() + ", Quantity: " + item.getQuantity() + ", Price: " + item.getPrice() + "\n===============");
                    return;
                }
            }
            System.out.println("Item not found.");
        }

      public void displayItems() {
            if (items.isEmpty()) {
                System.out.println("Inventory is empty.");
                return;
            }
    
            for (Item item : items) {
                    System.out.println("===============\nID: " + item.getItemId() + ", Name: " + item.getItemName() + ", Quantity: " + item.getQuantity() + ", Price: " + item.getPrice()+ "\n===============);
        }
      
    }
}
