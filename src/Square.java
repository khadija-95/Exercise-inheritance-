public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter for side
    public double getSide() {
        return getWidth();
    }

    // Setter for side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}