# Instructions

# Part 1

Create a class named **Pizza** that stores information about a single pizza. It should contain the following:
> - Constructor(s) that set all the instance variables
> - Public methods to get and set instance variables
> - A public method named calcCost() that returns a double that is the cost of the pizza
    >
- Pizza cost is determined by:
  >
- Small: $10 + $2 per topping
>     - Medium: $12 + $2 per topping
>     - Large: $14 + $2 per topping
> - Public method named getDescription() that returns a String containing the pizza size, quantity, and each topping

### Write a driver class in Main.java that creates several pizzas and outputs their descriptions.

_For example, a large pizza with one cheese, one pepperoni, and two ham toppings should cost a total of $22._

# Part 2

Now create a **PizzaOrder** class that allows up to three pizzas to be saved in an order.
> - Each pizza saved should be a Pizza object.
>  - Create a method called **calcTotal()** that returns the cost of the order.

## In the driver class, order two pizzas and return the total cost.