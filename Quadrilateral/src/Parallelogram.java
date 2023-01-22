public class Parallelogram extends Quadrilateral{

    protected double side2 = 0.0;

    public Parallelogram(double base, double height, double side2) {
        super(base, height);
        this.side2 = side2;
    }

    public double getPerimeter() {
        return Math.round((2*(base + side2)) * 100.0) / 100.0;
    }
}
