package calculator;

/**
 * @author Nick Patrikeos
 **/
public class Calculator {
    public static void main(String[] args) {
        Equation e = new Add(
            new Value(1),
            new Multiply(
                new Value(2),
                new Subtract(
                    new Value(3),
                    new Value(4)
                )
            )
        );
        System.out.println(e.evaluate());
        System.out.println(e.prettyify());
    }
}
