// Strategy Interface
interface Operation {
    void perform();
}

// Concrete Strategy: Add
class Add implements Operation {
    @Override
    public void perform() {
        System.out.println("Performing Addition");
    }
}

// Concrete Strategy: Multiply
class Multiply implements Operation {
    @Override
    public void perform() {
        System.out.println("Performing Multiplication");
    }
}

// Factory to create strategy
class OperationFactory {
    public static Operation getOperation(String type) {
        if (type.equalsIgnoreCase("add")) {
            return new Add();
        } else if (type.equalsIgnoreCase("multiply")) {
            return new Multiply();
        }
        return null;
    }
}

// Context class
class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void calculate() {
        if (operation != null) {
            operation.perform();
        } else {
            System.out.println("No operation set");
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Operation op = OperationFactory.getOperation("add");
        calc.setOperation(op);
        calc.calculate(); // Performing Addition

        op = OperationFactory.getOperation("multiply");
        calc.setOperation(op);
        calc.calculate(); // Performing Multiplication
    }
}
