class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        String[] smallToppings = {"Peperoni", "Olives"};
        String[] mediumToppings = {"Peperoni", "Olives", "Peppers", "Anchovies"};
        String[] largeToppings = {"Peperoni", "Olives", "Peppers", "Anchovies", "Pineapple", "Tuna", "Chicken"};
        Pizza mySmallPizza = new Pizza(PizzaSize.SMALL, smallToppings);
        System.out.println(mySmallPizza.getDescription());
        Pizza myMediumPizza = new Pizza(PizzaSize.MEDIUM, mediumToppings);
        System.out.println(myMediumPizza.getDescription());
        Pizza myLargePizza = new Pizza(PizzaSize.LARGE, largeToppings);
        System.out.println(myLargePizza.getDescription());

    }
}