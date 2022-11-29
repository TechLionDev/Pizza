public enum PizzaSize {
    SMALL(10.00, "Small"), MEDIUM(12.00, "Medium"), LARGE(14.00, "Large");

    public final double price;
    public final String value;

    PizzaSize(double price, String value) {
        this.price = price;
        this.value = value;
    }
}