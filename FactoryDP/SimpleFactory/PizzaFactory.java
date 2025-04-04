import pizza.*;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new VeggiePizza();
        }
        return null;
    }
}