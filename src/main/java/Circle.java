public class Circle implements GeometricFigure {
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return (pi * this.radius * this.radius);
    }

    @Override
    public Double calculatePerimeter() {
        return (2 * pi * this.radius);
    }
}
