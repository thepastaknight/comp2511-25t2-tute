package calculator;

public class Value implements Equation {
    private Integer value;

    public Value(Integer value) {
        this.value = value;
    }

    @Override
    public Integer evaluate() {
        return value;
    }

    @Override
    public String prettyify() {
        return value.toString();
    }
}
