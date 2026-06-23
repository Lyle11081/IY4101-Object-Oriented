public class Circle extends Shape{
    //properties
    private double radius;
    // Constructor
    public Circle(Coordinates coord, double radius) {
        super(0, coord); // A circle has no sides
        this.radius = radius;
    }
    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            this.radius *= factor;
        }
        else {
            this.radius /= factor;
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String Display() {return "Circle at " + position.Display() + "\nRadius: "
            + radius + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();}
    }