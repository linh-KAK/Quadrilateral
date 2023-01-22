abstract class Quadrilateral {

    protected double base = 0.0;
    protected double height = 0.0;

    public Quadrilateral(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return Math.round((base*height) * 100.0) / 100.0;
    }


}
