
public class Pizza {
    private String UUID;
    private int quantity;
    private PizzaSize size;
    private double price;
    private String[] toppings;

    public Pizza(PizzaSize size, String[] toppings, int quantity) {
        this.UUID = GenerateUUID.generateUUID();
        this.quantity = quantity;
        this.size = size;
        this.toppings = toppings;
        this.price = size.price + (2 * toppings.length);
    }

    public double calcCost() {
        return this.price;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(quantity + " ");
        switch (this.size) {
            case SMALL -> sb.append(Colors.GREEN + Colors.BOLD + "small" + Colors.RESET);
            case MEDIUM -> sb.append(Colors.YELLOW + Colors.BOLD + "medium" + Colors.RESET);
            case LARGE -> sb.append(Colors.RED + Colors.BOLD + "large" + Colors.RESET);
            default -> sb.append(Colors.RED + Colors.BOLD + "FATAL ERROR: UNKNOWN SIZE FOUND" + Colors.RESET);
        }
        if (quantity > 1) {
            sb.append(" pizzas was ordered with the following toppings:");
        } else {
            sb.append(" pizza was ordered with the following toppings:");
        }
        sb.append("\n");
        for (int i = 0; i < this.toppings.length; i++) {
            sb.append(" " + Colors.BOLD + Colors.PURPLE).append(i + 1).append(". ").append(Colors.RESET);
            sb.append(Colors.BOLD).append(this.toppings[i]).append(Colors.RESET);
            sb.append("\n");
        }
        sb.append(Colors.CYAN + "The total cost is: " + Colors.BOLD + Colors.BLUE + "$").append(Math.round(this.calcCost())).append(".00").append(Colors.RESET);
        sb.append("\n" + Colors.WHITE_BOLD + "The order ID is: " + Colors.RESET + Colors.BOLD + Colors.YELLOW + this.UUID + Colors.RESET);
        return sb.toString();
    }


    public PizzaSize getSize() {
        return size;
    }

    public String getStringSize() {
        return this.size.value;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}