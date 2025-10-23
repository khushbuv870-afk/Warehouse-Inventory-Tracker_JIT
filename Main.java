public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Add observer for alerts
        warehouse.addObserver(product -> System.out.println("⚠️ Restock Alert: Low stock for " + product.getName() +
                " – only " + product.getQuantity() + " left!"));

        // --- Add multiple products ---
        Product laptop = new Product("P001", "Laptop", 0, 5);
        Product phone = new Product("P002", "Smartphone", 0, 3);
        Product tablet = new Product("P003", "Tablet", 0, 4);

        warehouse.addProduct(laptop);
        warehouse.addProduct(phone);
        warehouse.addProduct(tablet);

        // --- Receive shipments ---
        warehouse.receiveShipment("P001", 10);
        warehouse.receiveShipment("P002", 5);
        warehouse.receiveShipment("P003", 8);

        // --- Fulfill some orders ---
        warehouse.fulfillOrder("P001", 7); // Laptop: alert when below 5
        warehouse.fulfillOrder("P002", 3); // Smartphone: alert when below 3
        warehouse.fulfillOrder("P003", 5); // Tablet: alert when below 4

        // --- Show all products ---
        warehouse.displayInventory();
    }
}
