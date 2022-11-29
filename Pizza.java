
@SuppressWarnings("ALL")
public class Pizza {
    private PizzaSize size;
    private double price;
    private String[] toppings;

    public Pizza(PizzaSize size, String[] toppings) {
        this.size = size;
        this.toppings = toppings;
        this.price = size.price + (2 * toppings.length);
    }

    public double calcCost() {
        return this.price;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("A ");
        switch (this.size) {
            case SMALL -> sb.append(Colors.GREEN + Colors.BOLD + "small" + Colors.RESET);
            case MEDIUM -> sb.append(Colors.YELLOW + Colors.BOLD + "medium" + Colors.RESET);
            case LARGE -> sb.append(Colors.RED + Colors.BOLD + "large" + Colors.RESET);
            default -> sb.append(Colors.RED + Colors.BOLD + "FATAL ERROR: UNKNOWN SIZE FOUND" + Colors.RESET);
        }
        sb.append(" pizza was ordered with the following toppings:");
        sb.append("\n");
        for (int i = 0; i < this.toppings.length; i++) {
            sb.append(" " + Colors.BOLD + Colors.PURPLE).append(i + 1).append(". ").append(Colors.RESET);
            sb.append(Colors.BOLD).append(this.toppings[i]).append(Colors.RESET);
            sb.append("\n");
        }
        sb.append(Colors.CYAN + "The total cost is: " + Colors.BOLD + Colors.BLUE + "$").append(Math.round(this.calcCost())).append(".00").append(Colors.RESET);
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
}