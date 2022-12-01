import java.util.ArrayList;
import java.util.List;

import static java.util.List.copyOf;

class Main {
    private static PizzaSize size;
    private static int quantity;
    private static String[] toppings;

    public static void main(String[] args) {
        getInfo();
        Pizza order = createPizzaOrder(size, quantity, toppings);
        System.out.println(order.getDescription());
    }

    private static Pizza createPizzaOrder(PizzaSize psize, int pquantity, String[] ptoppings) {
        Pizza newOrder = new Pizza(psize, ptoppings, pquantity);
        return newOrder;
    }

    static void getInfo() {
        System.out.println(Colors.BOLD + Colors.GREEN + "Welcome to the Pizza System!\n" + Colors.RESET);
        PizzaSize psize = getSize();
        size = psize;
        int pquantity = getQuantity();
        quantity = pquantity;
        String[] ptoppings = getToppings();
        toppings = ptoppings;
    }

    static int getQuantity() {
        System.out.println("\nPlease enter the number of " + size.value + " pizza's you would like to order.");
        int quantity = Input.getInt();
        return quantity;
    }

    static PizzaSize getSize() {
        PizzaSize[] choices = {PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE};
        int choice;
        PizzaSize pickedSize;
        do {
            Option selectedSize = new Option(choices);
            System.out.print("Please enter the number of the size you wish to order:");
            choice = Input.getInt();
            pickedSize = PizzaSize.DEFAULT;
            if (choice == 1) {
                pickedSize = PizzaSize.SMALL;
            } else if (choice == 2) {
                pickedSize = PizzaSize.MEDIUM;
            } else if (choice == 3) {
                pickedSize = PizzaSize.LARGE;
            }
        } while (choice > 3);
        return pickedSize;
    }

    static String[] getToppings() {
        if (quantity > 1) {
            System.out.println("Please enter all the topping(s) you would like on your " + quantity + " " + size.value.toLowerCase() + " pizzas.\nType \"Done\" when finished.");
        } else {
            System.out.println("Please enter the topping(s) you would like on your " + size.value + " pizza\nType \"Done\" when finished.");
        }
        List<String> toppings = new ArrayList<String>();
        while (Input.hasNext()) {
            String topping = Input.getString();
            if (topping.equalsIgnoreCase("Done")) {
                String[] arr = toppings.toArray(new String[0]);
                return arr;
            } else {
                toppings.add(Input.getString());
            }
        }
        return new String[]{"The Toppings You Provided Were Not Captured Properly."};
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