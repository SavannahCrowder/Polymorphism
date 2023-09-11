class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Pink", true, 5.0);
        Triangle triangle = new Triangle("Red", false, 4.0, 3.0);
        Rectangle rectangle = new Rectangle("Blue", true, 6.0, 2.0);

        System.out.println("Circle: " + circle.area());
        System.out.println("Rectangle: " + rectangle.area());
        System.out.println("Triangle: " + triangle.area());
    }
}