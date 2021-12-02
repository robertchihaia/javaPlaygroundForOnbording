public class Square implements GeometricFigure {

    Double length;

    public Square(Double length) {
        this.length = length;
    }

    @Override
    public Double calculateArea() {
        return (length * length);
    }

    @Override
    public Double calculatePerimeter() {
        return (4 * length);
    }
}
