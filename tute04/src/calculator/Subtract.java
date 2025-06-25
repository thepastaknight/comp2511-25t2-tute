package calculator;

public class Subtract implements Equation {
    private Equation left;
    private Equation right;

    public Subtract(Equation left, Equation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer evaluate() {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String prettyify() {
        return "(" + left.prettyify() + " - " + right.prettyify() + ")";
    }
}
