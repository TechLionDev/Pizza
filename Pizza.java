
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
            case SMALL:
                sb.append(Colors.GREEN + Colors.BOLD + "small" + Colors.RESET);
                break;
            case MEDIUM:
                sb.append(Colors.YELLOW + Colors.BOLD + "medium" + Colors.RESET);
                break;
            case LARGE:
                sb.append(Colors.RED + Colors.BOLD + "large" + Colors.RESET);
                break;
            default:
                sb.append(Colors.RED + Colors.BOLD + "FATAL ERROR: UNKNOWN SIZE FOUND" + Colors.RESET);
                break;


        }
        sb.append(" pizza was ordered with the following toppings:");
        sb.append("\n");
        for (int i = 0; i < this.toppings.length; i++) {
            sb.append(" " + Colors.BOLD + Colors.PURPLE + (i + 1) + ". " + Colors.RESET);
            sb.append(Colors.BOLD + this.toppings[i] + Colors.RESET);
            sb.append("\n");
        }
        sb.append(Colors.CYAN + "The total cost is: " + Colors.BOLD + Colors.BLUE + "$" + Math.round(this.calcCost()) + ".00" + Colors.RESET);
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