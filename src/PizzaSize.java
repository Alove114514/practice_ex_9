enum PizzaSize {
    SMALL("Small", 2),
    MEDIUM("Medium", 4),
    LARGE("Large", 6);

    private final String pizzaSize;
    private final double addToPizzaPrice;

    PizzaSize(String size, double price) {
        this.pizzaSize = size;
        this.addToPizzaPrice = price;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public double getAddToPizzaPrice() {
        return addToPizzaPrice;
    }

    public String toString() {
        return pizzaSize + " - " + addToPizzaPrice;
    }
}