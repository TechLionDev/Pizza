class Main {
  public static void main(String[] args) {
    String[] toppings = { "Peperoni", "Olives", "Pepers", "Anchovies", "Pineapple" };
    Pizza myPizza = new Pizza(PizzaSize.LARGE, toppings);
    System.out.println(myPizza.getStringSize());
    System.out.println(myPizza.getPrice());
  }
}