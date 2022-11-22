public class Pizza {
  private PizzaSize size;
  private double price;
  private String[] toppings;

  public Pizza(PizzaSize size, String[] toppings) {
    this.size = size;
    this.toppings = toppings;
    this.price = size.price + (2 * toppings.length);
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