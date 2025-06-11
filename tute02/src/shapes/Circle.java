package shapes;

public class Circle extends Shape implements Resizable {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(int scaleFactor) {
        radius *= scaleFactor;
    }
}
