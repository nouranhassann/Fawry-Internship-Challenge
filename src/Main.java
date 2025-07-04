import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Setup sample products
        Cheese cheese = new Cheese("Cheese", 100, 5, 0.4, LocalDate.of(2025, 8, 1));
        Biscuits biscuits = new Biscuits("Biscuits", 150, 3, 0.7, LocalDate.of(2025, 8, 1));
        TV tv = new TV("TV", 300, 2, 10);
        MobileScratchCard scratchCard = new MobileScratchCard("Scratch Card", 50, 10);

        // Create cart and customer
        Cart cart = new Cart();
        Customer customer = new Customer("Nouran", 1000); // FAKE BALANCE

        // Add products to cart
        cart.add(cheese, 2);
        cart.add(biscuits, 1);

        // Perform checkout
        ECommerceSystem.checkout(customer, cart);
    }
}
