class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {}

    public Triangle(String color, boolean filled, double base, double height) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return (base * height) / 2;
    }
}