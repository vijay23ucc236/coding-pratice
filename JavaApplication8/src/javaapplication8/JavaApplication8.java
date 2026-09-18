
package javaapplication8;

public class JavaApplication8 {

  
  import java.util.Scanner;

class ShoppingCart {

    String cartOwnerName;

    class Item {

        String itemName;
        int quantity;
        double[] priceHistory;

        void addItem(Scanner sc) {

            System.out.print("Enter Cart Owner Name: ");
            cartOwnerName = sc.nextLine();

            System.out.print("Enter Item Name: ");
            itemName = sc.nextLine();

            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();

            System.out.print("Enter Number of Price Updates: ");
            int updates = sc.nextInt();

            priceHistory = new double[updates];

            System.out.println("Enter Prices:");

            for (int i = 0; i < priceHistory.length; i++) {
                priceHistory[i] = sc.nextDouble();
            }

            System.out.println("Item added successfully.");
        }

        void updatePriceHistory(Scanner sc) {

            if (priceHistory == null) {
                System.out.println("Please add item first.");
                return;
            }

            System.out.println("Current Price History:");

            for (double price : priceHistory) {
                System.out.print(price + " ");
            }

            System.out.println("\nPrice history already stored.");
        }

        double getLatestPrice() {

            return priceHistory[priceHistory.length - 1];
        }

        void calculateTotalBill() {

            if (priceHistory == null) {
                System.out.println("Please add item first.");
                return;
            }

            double latestPrice = getLatestPrice();

            double totalBill = latestPrice * quantity;

            System.out.println("Latest Price: " + latestPrice);
            System.out.println("Total Bill: " + totalBill);
        }

        void displayCartDetails() {

            if (priceHistory == null) {
                System.out.println("Please add item first.");
                return;
            }

            double latestPrice = getLatestPrice();
            double totalBill = latestPrice * quantity;

            System.out.println("\n===== CART DETAILS =====");
            System.out.println("Cart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");

            for (double price : priceHistory) {
                System.out.print(price + " ");
            }

            System.out.println("\nLatest Price: " + latestPrice);
            System.out.println("Total Bill: " + totalBill);
        }
    }
}

public class ShoppingCartMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();
        ShoppingCart.Item item = cart.new Item();

        int choice;

        do {

            System.out.println("\n===== SHOPPING CART MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. Update Price History");
            System.out.println("3. Calculate Total Bill");
            System.out.println("4. Display Cart Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    item.addItem(sc);
                    break;

                case 2:
                    item.updatePriceHistory(sc);
                    break;

                case 3:
                    item.calculateTotalBill();
                    break;

                case 4:
                    item.displayCartDetails();
                    break;

                case 5:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
    
}
