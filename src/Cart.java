import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(@org.jetbrains.annotations.NotNull Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Not enough quantity for " + product.getName());
        }
        items.add(new CartItem(product, quantity));
    }

    public List<CartItem> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
