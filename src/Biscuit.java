import java.time.LocalDate;

class Biscuits extends Product implements Expirable, Shippable {
    private double weight;
    private LocalDate expiryDate;

    public Biscuits(String name, double price, int quantity, double weight, LocalDate expiryDate) {
        super(name, price, quantity);
        this.weight = weight;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public double getWeight() { return weight; }
}