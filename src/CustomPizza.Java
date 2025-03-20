import java.util.ArrayList;
import java.util.List;

public class CustomPizza {
    private List<PizzaToppings> toppings;
    private double basePrice;

    public CustomPizza(double basePrice) {
        this.toppings = new ArrayList<>();
        this.basePrice = basePrice;
    }

    public void addTopping(PizzaToppings topping) {
        toppings.add(topping);
    }

    public double getTotalPrice() {
        double total = basePrice;
        for (PizzaToppings topping : toppings) {
            total += topping.getToppingPrice();
        }
        return total;
    }

    public String getToppingsString() {
        StringBuilder toppingsStr = new StringBuilder();
        for (PizzaToppings topping : toppings) {
            toppingsStr.append(topping.getTopping()).append(", ");
        }
        if (toppingsStr.length() > 0) {
            toppingsStr.delete(toppingsStr.length() - 2, toppingsStr.length());
        }
        return toppingsStr.toString();
    }

    @Override
    public String toString() {
        return " Custom Pizza with " + getToppingsString() + ": €" + getTotalPrice();
    }
}