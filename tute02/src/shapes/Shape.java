package shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    public String color;

    private static int count = 0;

    public Shape(String colour) {
        System.out.println("Inside Shape constructor");
        this.colour = colour;
        count++;
    }

    public void foo() {
        System.out.println("Shape!");
    }

    public abstract double area();

    public static void main(String[] args) {
        Rectangle r = new Rectangle("hello");
        Circle c = new Circle("orange", 5);
        r.area();
        c.area();

        double total = 0;
        List<Shape> l = new ArrayList<Shape>();
        l.add(r);
        l.add(c);
        for (Shape s : l) {
            total += s.area();
        }
    }

    public String getColor() {
        return color;
    }
}
