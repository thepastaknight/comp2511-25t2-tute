package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public static final int ANGLE = 90;
    public static int count = 0;

    public Rectangle(String color) {
        super(color);
        count++;
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String color, int width, int height) {
        this(color);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    @Override
    public void foo() {
        System.out.println("Rectangle!");
        // super.foo();
    }

    public static void bar() {
        System.out.println(ANGLE);
    }

    public static void main(String[] args) {
        System.out.println(Rectangle.ANGLE);

        Rectangle r1 = new Rectangle("red", 10, 20);
        Rectangle r2 = new Rectangle("red", 10, 20);


        r1.width = 30;
        r1.height = 40;
        System.out.println(r1.width + " " + r1.height);
        System.out.println(r2.width + " " + r2.height);
        // Shape s = new Shape("red");

        // Print rectangle
        // r.foo();

        // print shape
        // s.foo();

        // Print rectangle
        // Shape s2 = (Shape) r;
        // s2.foo();
    }

    @Override
    public double area() {
        return width * height;
    }
}
