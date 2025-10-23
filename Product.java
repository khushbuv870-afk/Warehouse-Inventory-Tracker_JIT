public class Product {
    private String id;
    private String name;
    private int quantity;
    private int reorderThreshold;

    public Product(String id, String name, int quantity, int reorderThreshold) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.reorderThreshold = reorderThreshold;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

    // Update stock
    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (amount > quantity) {
            throw new IllegalArgumentException("Not enough stock available!");
        }
        quantity -= amount;
    }
}
