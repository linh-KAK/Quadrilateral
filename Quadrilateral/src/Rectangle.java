public class Rectangle extends Parallelogram {

    public Rectangle(double base, double height) {
        super(base, height, height);
    }

    public double getPerimeter() {
        return Math.round((2*(base + height)) * 100.0) / 100.0;
    }
}
