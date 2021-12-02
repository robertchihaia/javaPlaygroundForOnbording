public class Triangle implements GeometricFigure {
    Double side1;
    Double side2;
    Double base;
    Double height;

    public Triangle(Double side1, Double side2, Double base, Double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return (side1 + side2 + base);
    }

    @Override
    public Double calculatePerimeter() {
        return (0.5 * base * height);
    }
}
