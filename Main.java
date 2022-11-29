class Main {
    public static void main(String[] args) {

    }
}

class genericPizzas {
    public static void main(String[] args) {
        System.out.println("\n");
        String[] smallToppings = {"Peperoni", "Olives"};
        String[] mediumToppings = {"Peperoni", "Olives", "Peppers", "Anchovies"};
        String[] largeToppings = {"Peperoni", "Olives", "Peppers", "Anchovies", "Pineapple", "Tuna", "Chicken"};
        Pizza mySmallPizza = new Pizza(PizzaSize.SMALL, smallToppings, 5);
        System.out.println(mySmallPizza.getDescription());
        Pizza myMediumPizza = new Pizza(PizzaSize.MEDIUM, mediumToppings, 1);
        System.out.println(myMediumPizza.getDescription());
        Pizza myLargePizza = new Pizza(PizzaSize.LARGE, largeToppings, 6);
        System.out.println(myLargePizza.getDescription());
    }
}