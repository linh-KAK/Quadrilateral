public class Trapezoid extends Quadrilateral{

    private double base2 = 0.0;
    private double side1 = 0.0;
    private double side2 = 0.0;

    public Trapezoid (double base1, double base2, double height, double side1, double side2) {
        super(base1, height);
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return Math.round(((base+base2)*height/2) * 100.0) / 100.0;
    }

    public double getPerimeter() {
        return Math.round((base+base2+side1+side2) * 100.0) / 100.0;
    }
}
