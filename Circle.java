import java.lang.Math;

class Circle extends Shape {
    private double radius;

    public Circle() {}

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }
}