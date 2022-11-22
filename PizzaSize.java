public enum PizzaSize {
  SMALL(10.00,"Small"), MEDIUM(12.00,"Medium"), LARGE(14.00,"Large");
  
  public double price;
  public String value;
  
  private PizzaSize(double price, String value) {
    this.price = price;
    this.value = value;
  }
}