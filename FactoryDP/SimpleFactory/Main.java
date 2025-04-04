import pizza.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.createPizza("cheese");
        if (pizza != null) {
            pizza.prepare();
        } else {
            System.out.println("Invalid pizza type");
        }
    }
}