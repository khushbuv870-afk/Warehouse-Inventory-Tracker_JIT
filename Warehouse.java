import java.util.*;

public class Warehouse {
    private Map<String, Product> inventory = new HashMap<>();
    private List<AlertService> observers = new ArrayList<>();

    // Register an observer (for alerts)
    public void addObserver(AlertService observer) {
        observers.add(observer);
    }

    // Notify all observers
    private void notifyLowStock(Product product) {
        for (AlertService observer : observers) {
            observer.onLowStock(product);
        }
    }

    // Add a new product
    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
        System.out.println("Added product: " + product.getName());
    }

    // Receive new stock shipment
    public void receiveShipment(String productId, int amount) {
        Product product = inventory.get(productId);
        if (product == null) {
            System.out.println("Product ID not found!");
            return;
        }
        product.increaseQuantity(amount);
        System.out.println("Received " + amount + " units of " + product.getName());
    }

    // Fulfill customer order
    public void fulfillOrder(String productId, int amount) {
        Product product = inventory.get(productId);
        if (product == null) {
            System.out.println("Product ID not found!");
            return;
        }

        try {
            product.decreaseQuantity(amount);
            System.out.println("Fulfilled order of " + amount + " units for " + product.getName());
            if (product.getQuantity() < product.getReorderThreshold()) {
                notifyLowStock(product);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Display all products
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p.getName() + " - Quantity: " + p.getQuantity());
        }
    }
}
