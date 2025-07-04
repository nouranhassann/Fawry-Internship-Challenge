import java.util.ArrayList;
import java.util.List;

class ECommerceSystem {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalArgumentException("Cart is empty");
        }

        double subtotal = 0;
        List<Shippable> shippables = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.product;
            int q = item.quantity;

            if (p instanceof Expirable) {
                Expirable e = (Expirable) p;
                if (e.isExpired()) {
                    throw new IllegalArgumentException("Product expired: " + p.getName());
                }
            }

            if (q > p.getQuantity()) {
                throw new IllegalArgumentException("Not enough stock for " + p.getName());
            }

            p.reduceQuantity(q);
            subtotal += p.getPrice() * q;

            if (p instanceof Shippable) {
                for (int i = 0; i < q; i++) {
                    shippables.add((Shippable) p);
                }
            }
        }

        double shippingFee = shippables.isEmpty() ? 0 : 30;
        double total = subtotal + shippingFee;

        if (customer.getBalance() < total) {
            throw new IllegalArgumentException("Insufficient balance for checkout");
        }

        // Ship items
        if (shippables.isEmpty()) {
        } else {
            ShippingService.ship(shippables);
        }

        // Final output
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.quantity + "x " + item.product.getName() + " - " + item.product.getPrice() * item.quantity);
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Shipping: " + shippingFee);
        System.out.println("Amount: " + total);

        customer.pay(total);
        customer.printBalance();
    }
}