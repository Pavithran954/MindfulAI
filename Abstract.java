package abs;

abstract class ArithmeticOperations {
    abstract void operation();

    public void subtraction() {
        System.out.println("Subtraction");
    }

    public void multiplication() {
        System.out.println("Multiplication");
    }
}

class Addition extends ArithmeticOperations {
    void operation() {
        System.out.println("Addition");
    }

    public void division() {
        System.out.println("Division");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.operation();
        add.subtraction();
        add.multiplication();
        add.division();
    }
}
