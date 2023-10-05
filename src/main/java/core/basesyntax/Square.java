package core.basesyntax;

public class Square extends Figure {
    private String color;
    private double sideLength;

    public Square(String string, double sideLength) {
        super(string);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure square,area:" + getArea() + "sq.units,side:"
                + sideLength + "units,color:" + color);
    }
}
