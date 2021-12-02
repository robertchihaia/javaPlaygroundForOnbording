public class Rectangle implements GeometricFigure {

    Double length;
    Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return (length * width);
    }

    @Override
    public Double calculatePerimeter() {
        return (2 * (length + width));
    }
}
